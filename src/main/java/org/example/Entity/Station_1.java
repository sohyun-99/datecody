package org.example.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Station_1 {
    @Id
    //@Column(name = "store")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int store; //가게 의 개인 번호

    private String store_name; //가게의 이름

    private String station_name; //지하철 역명

    //@Column(name = "kind", unique = true)
    private int kind; //종류 : 식사(1)/ 디저트(2) / 액티비티(3)

    private String etc; //기타 내용
}
