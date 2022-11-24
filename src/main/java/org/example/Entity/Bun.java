package org.example.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Bun {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int storeId; //지하철 역명 번호가아니라 가게번호

    private String storeName; //가게명
    private String stationName; //지하철 역명
    private int stationNum; //지하철 번호 (기흥=1 이라고 신갈은=2라고 지정)
    //@Column(name = "kind", unique = true)
    private int kind; //종류 : 식사(1)/ 디저트(2) / 액티비티(3)
    private String etc; //기타 내용

}
