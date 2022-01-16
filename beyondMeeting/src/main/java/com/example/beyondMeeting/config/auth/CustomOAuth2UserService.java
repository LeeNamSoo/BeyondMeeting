package com.example.beyondMeeting.config.auth;

import com.example.beyondMeeting.config.auth.dto.OAuthAttributes;
import com.example.beyondMeeting.config.auth.dto.SessionUser;
import com.example.beyondMeeting.domain.user.User;
import com.example.beyondMeeting.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Collections;

@RequiredArgsConstructor
@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {

    private final UserRepository userRepository;
    private final HttpSession httpSession;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2UserService<OAuth2UserRequest, OAuth2User> delegate = new DefaultOAuth2UserService();
        OAuth2User oAuth2User = delegate.loadUser(userRequest);

        String registrationId = userRequest.getClientRegistration().getRegistrationId(); // 1. registrationId : 현재 로그인 진행 중인 서비스를 구분.. (구글,네이버,카카오인지 구분)
        String userNameAttributeName = userRequest.getClientRegistration().getProviderDetails()
                .getUserInfoEndpoint().getUserNameAttributeName(); 
        // 2. userNameAttributeName: OAuth2 로그인 진행 시 키가 되는 필드값.. primary key 같은 의미
        // 구글은 기본 코드를 지원하지만 , 네이버,카카오는 지원 하지 않는다. 구글기본코드는 sub
        // 네이버, 구글 로그인 동시 지원할 때 사용

        OAuthAttributes attributes = OAuthAttributes.of(registrationId, userNameAttributeName, oAuth2User.getAttributes()); //
        //3. OAuthAttributes : OAuth2User의 attribute를 담을 클래스.. 소셜로그인 공통사항
        
        User user = saveOrUpdate(attributes);

        httpSession.setAttribute("user", new SessionUser(user)); // 4. SessionUser : 세션에 사용자 정보 저장하기 위한 Dto 클래스

        return new DefaultOAuth2User(Collections.singleton(new SimpleGrantedAuthority(user.getRoleKey())),
                attributes.getAttributes(),
                attributes.getNameAttributeKey());
    }

    // 사용자 정보가 업데이트 되었을 때 User 엔티티에도 반영
    private User saveOrUpdate(OAuthAttributes attributes) {
        User user = userRepository.findByEmail(attributes.getEmail())
                .map(entity -> entity.update(attributes.getName(), attributes.getPicture()))
                .orElse(attributes.toEntity());

        return userRepository.save(user);
    }

}