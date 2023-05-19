package com.tikkeul.app.controller;

import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@Slf4j
@RequestMapping("/join/*")
@RequiredArgsConstructor
public class JoinController {
//    final UserMapper userMapper;
//    private JoinController joinController;
//    //    아이디 중복검사
//    @PostMapping("user")
//    public void goToJoinForm(){
//    };
//
//    //    회원가입
//    public void insert(UserVO userVO){
//        userMapper.insert(userVO);
//    };
}
