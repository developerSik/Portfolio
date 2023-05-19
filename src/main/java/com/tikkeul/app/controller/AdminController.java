package com.tikkeul.app.controller;

import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.service.admin.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/Daumyulmae/*")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("member/list")
    public void goToListForm(){
        log.info("memberController.....");
    }

    @GetMapping("yulmaemukruk")
    public void goToDetailForm( ) {

    }

}
