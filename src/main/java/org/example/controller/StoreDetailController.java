package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.Entity.Bun;
import org.example.repository.StationBunRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class StoreDetailController {
    private final StationBunRepository stationBunRepository;

    @GetMapping("/station={station_name}&storeId={store_id}")
    public String getStoreDetail(Model model, @PathVariable("station_name") String station_name,
                                 @PathVariable("store_id") int store_id){
        if(station_name.equals("bundang")){
            List<Bun> bunList = stationBunRepository.findByStoreId(store_id);
            model.addAttribute("stationList",bunList);
        }
        return "storeDetail";
    }
}
