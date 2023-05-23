package com.tikkeul.app.controller;

import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import com.tikkeul.app.service.email.RegisterMail;
import com.tikkeul.app.service.join.JoinService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/join/*")
public class JoinController {
    private final  UserMapper userMapper;
    private final JoinService joinService;




    //    아이디 중복검사
    @GetMapping("check-id/{identification}")

    @ResponseBody
    public boolean checkId(@PathVariable String identification){
        return joinService.checkId(identification).isPresent();
    }

//  회원가입폼으로 이동
    @GetMapping("join")
    public void goToJoin(UserVO userVO){;}

    //        회원가입
    @PostMapping("join")
    public RedirectView join(UserVO userVO) {
        joinService.join(userVO);
        return new RedirectView("/join/login");
    };


    @GetMapping("login")
    public void gotoLogin(UserVO userVO){;}



    @PostMapping("login")
    public RedirectView login(String identification, String password, HttpSession session, RedirectAttributes redirectAttributes){
        log.info("들어옴");
        final Optional<Long> foundUser = joinService.login(identification, password);
        if(foundUser.isPresent()){
            session.setAttribute("id", foundUser.get());
            return new RedirectView("/join/mainpage");
        }
        redirectAttributes.addFlashAttribute("login", "fail");
        return new RedirectView("/join/login");
    }

    //    로그아웃
    @GetMapping("logout")
    public RedirectView logout(HttpSession session){
        session.invalidate();
        return new RedirectView("/join/mainpage");
    }

    @GetMapping("mainpage")
    public void goToMain(HttpSession session){;}



    // 이메일 인증
    // 회원가입 메일 서비스
    private final RegisterMail registerMail;

    @PostMapping("mailConfirm")
    @ResponseBody
    String mailConfirm(@RequestParam("email") String email) throws Exception {
        String code = registerMail.sendSimpleMessage(email);
        System.out.println("인증코드 : " + code);
        return code;
    }
    @GetMapping("findid")
    public void goTofindid(){;}
}
