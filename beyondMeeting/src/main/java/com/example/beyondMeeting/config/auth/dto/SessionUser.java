package com.example.beyondMeeting.config.auth.dto;
import com.example.beyondMeeting.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }

}
// User 클래스를 그대로 사용하지 않고 SessionUser클래스로 사용하는 이유는?
// 직렬화?!