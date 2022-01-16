package com.example.beyondMeeting.config.auth;

import com.example.beyondMeeting.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity //1. Spring Security 설정 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable().headers().frameOptions().disable() // 2. h2-console 를 사용하기 위한 옵션 disable

                .and()
                .authorizeRequests() // 3. URL별 권환관리 설정하는 옵션 시작.. 이걸 해야 antMatchers 옵션사용가능
                .antMatchers("/", "/css/**", "/images/**",
                        "/js/**", "/h2-console/**").permitAll() // 4. antMatchers : 권한 관리 대상 지정..URL,HTTP 메소드별로 관리 가능.
                                                            // .permitAll: 가로안에 url 전체권한주었음
                .antMatchers("/api/v1/**").hasRole(Role.USER.name()) // /api/v1/** 주소를 가진 API는 USER권한을 가진 사람만 가능
                .anyRequest().authenticated() // 5. anyRequest : 설정된 값 이외의 URL들을 나타냄
                                            // authenticated : 인증된(로그인) 사용자들은 허용

                .and()
                .logout().logoutSuccessUrl("/") // 로그아웃 성공 시 / 주소로 이동

                .and()
                .oauth2Login() // OAuth2 로그인 기능에 대한 설정 진입점
                .userInfoEndpoint() // OAuth2 로그인 성공 이후 사용자 정보를 가져올 때의 설정 담당
                .userService(customOAuth2UserService); //소셜로그인 성공 후에 진행할 UserService 인터페이스 등록
                                           // 리소스 서버(소셜서비스들)에서 사용자 정보를 가져온 상태에서 추가로 진행하고자 하는 기능을 명시할 수 있음!!
    }
}