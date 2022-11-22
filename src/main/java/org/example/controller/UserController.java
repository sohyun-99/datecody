package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.login.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

//    @PostMapping("/user")
//    public String signup(UserInfoDto infoDto) { // 회원 추가
//        userService.save(infoDto);
//        return "redirect:/login";
//    }

    @GetMapping(value = "/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }
}
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@RequiredArgsConstructor
//public class UserController {
//
//    private final UserRepository userRepository;
//
//    @GetMapping({"", "/"})
//    public String index() {
//        return "login/index";
//    }
//
//    @GetMapping("/login")
//    public @ResponseBody String user() {
//        return "login/index";
//    }
//
//    @GetMapping("/admin")
//    public @ResponseBody String admin() {
//        return "admin";
//    }
//
//    @GetMapping("/manager")
//    public @ResponseBody String manager() {
//        return "manager";
//    }
//
//    @GetMapping("/loginForm")
//    public String loginForm() {
//        return "login/index";
//    }
//
//    @GetMapping("/user")
//    public String loginForm2() {
//        return "user/index";
//    }
//
////
//
//    @GetMapping("/joinForm")
//    public String joinForm() {
//        return "joinForm";
//    }
//
//    @PostMapping("/join")
//    public String join(UserInfo user) {
//        return "redirect:/login";
//    }
//
//
//
//}