package org.example.Entity;

import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Builder
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class location {
    @Id
    //@Column(name = "locationName")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int localId; //지역명

    private int localName; //역명
    //@Column(name = "email", unique = true)
    private String email;

    //@Column(name = "password")
    private String password;

    //@Column(name = "auth")
    private String auth;

}
