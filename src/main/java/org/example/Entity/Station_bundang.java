package org.example.Entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Station_bundang {
    @Id
    @Column(name = "code")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String store; //가게명

    private String station_name; //지하철 역명

    @Column(name = "email", unique = true)
    private int kind; //종류 : 식사(1)/ 디저트(2) / 액티비티(3)
    private String etc; //기타 내용
}
