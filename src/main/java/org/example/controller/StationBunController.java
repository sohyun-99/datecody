package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.service.StationBunService;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class StationBunController {
    private final StationBunService stationBunService;
}
