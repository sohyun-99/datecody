package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.Entity.StationBun;
import org.example.Entity.UserInfo;
import org.example.login.UserRepository;
import org.example.repository.StationBunRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StationBunService {

    private final StationBunRepository stationBunRepository;

    /**
     * 불러오깅
     *
     * @param station_name 지정한 지하철 역명
     * @return 지정한 지하철 역에 대한 리스트 리턴
     */
//    public Optional<StationBun> findByStation_name(String station_name){
//        return stationBunRepository.findByStation_name(station_name);
//    }

    /**
     * 불러오깅
     *
     * @param infoDto 회원정보가 들어있는 DTO
     * @return 저장되는 회원의 PK
     */
//    public Long save(UserInfoDto infoDto) {
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        infoDto.setPassword(encoder.encode(infoDto.getPassword()));
//
//        return userRepository.save(UserInfo.builder()
//                .email(infoDto.getEmail())
//                .auth(infoDto.getAuth())
//                .password(infoDto.getPassword()).build()).getCode();
//    }


}
