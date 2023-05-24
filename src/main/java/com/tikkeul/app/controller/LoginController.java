package com.tikkeul.app.controller;

import com.tikkeul.app.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequiredArgsConstructor
public class LoginController {

    @RequestMapping(value="login/oauth2/code/naver", method=RequestMethod.GET)
    public String loginPOSTNaver(HttpSession session) {
        log.info("callback controller");
        return "callback";
    }

}
