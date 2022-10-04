package org.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity //엔티티
@Data
public class User {
    @Id
    @GeneratedValue
    private int id; //기본키

    private String username; //사용자 아이디
    private String password; //사용자 비밀번호
    private String email; //사용자 이메일
    private String role; //사용자 권한

    private Timestamp createDate; //회원가입한 날짜
}
