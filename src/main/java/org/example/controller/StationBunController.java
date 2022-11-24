package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.Entity.Bun;
import org.example.repository.StationBunRepository;
import org.example.service.StationBunService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class StationBunController {
    private final StationBunService stationBunService;
    private final StationBunRepository stationBunRepository;

    @GetMapping("/bun")
    public String getBun(Model model){
        String[] bunAllList = {"수원","매교","수원시청","매탄권선", "망포","영통", "청명" ,"상갈" ,"기흥" ,"신갈" ,"구성" ,"보정" ,"죽전" ,"오리" ,"미금" ,"정자"};
        // 수내 서현 이매 야탑 도곡 구룔 개포동 대모산입구 수서 복정 가천대 태평 모란 한티 선릉 선정릉 강남구청 압구정로데오 서울숲 왕십리 청량리

        model.addAttribute("bunAllList",bunAllList);
        return "bundang";
    }
    @GetMapping("/bun={bun_num}")
    public String getBunNum(Model model, @PathVariable("bun_num") int bun_num ){

        List<Bun> bunNumList = stationBunRepository.findByStationNum(bun_num);

        //카테고리 별 정보
        List<Bun> bunNumKind1 = stationBunRepository.findByStationNumAndKind(bun_num,1);
        List<Bun> bunNumKind2 = stationBunRepository.findByStationNumAndKind(bun_num,2);
        List<Bun> bunNumKind3 = stationBunRepository.findByStationNumAndKind(bun_num,3);

        //카테고리 별 정보 랜덤
        int randCourse1=(int)(bunNumKind1.stream().count())-1; //식사 랜덤
        int randCourse2=(int)(bunNumKind2.stream().count())-1; //디저트 랜덤
        int randCourse3=(int)(bunNumKind3.stream().count())-1; //액티비티 랜덤

        System.out.println(randCourse3);

        model.addAttribute("bunNumList",bunNumList);
        model.addAttribute("rand1",bunNumKind1.get(randCourse1));
        model.addAttribute("rand2",bunNumKind2.get(randCourse2));
        model.addAttribute("rand3",bunNumKind3.get(randCourse3));

        return "bundangDetail";

    }

//    stationBunService.findByStation_name("신갈")
}
