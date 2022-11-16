package org.example.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class StationBun {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int store_id; //지하철 역명 번호가아니라 가게번호

    private String store_name; //가게명
    private String station_name; //지하철 역명

    //@Column(name = "kind", unique = true)
    private int kind; //종류 : 식사(1)/ 디저트(2) / 액티비티(3)
    private String etc; //기타 내용

}
