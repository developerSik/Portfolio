package com.tikkeul.app.controller;


import com.tikkeul.app.domain.vo.DoranBoardVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/doranboard/*")
@RequiredArgsConstructor
public class DoranBoardController {

    private final DoranBoardVO doranBoardVO;
    @GetMapping("list")
    public void goToWriteForm(){;}


}
