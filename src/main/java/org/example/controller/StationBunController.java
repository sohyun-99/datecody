package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.Entity.Bun;
import org.example.Entity.StationBun;
import org.example.repository.StationBunRepository;
import org.example.service.StationBunService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class StationBunController {
    private final StationBunService stationBunService;
    private final StationBunRepository stationBunRepository;
    @GetMapping("/bun={bun_num}")
    public String getBun(Model model, @PathVariable("bun_num") int bun_num ){

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

        return "bundang";

    }

//    stationBunService.findByStation_name("신갈")
}
