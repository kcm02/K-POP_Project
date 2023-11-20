package project.kpop.kpop.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
// 자체 로그인 회원가입 API에 RequestBody로 사용할 클래스
public class UserSignUpDto {

    private String email;
    private String password;
    private String nickname;
    private int age;
    private String city;
}
