package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.Entity.UserInfo;
import org.example.login.UserRepository;
import org.example.repository.StationBunRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StationBunService {

    private final StationBunRepository stationBunRepository;

    /**
     * 불러오깅
     *
     *
     * @return
     */

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
