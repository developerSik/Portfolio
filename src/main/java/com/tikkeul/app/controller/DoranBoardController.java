package com.tikkeul.app.controller;

import com.tikkeul.app.domain.vo.DoranBoardDTO;
import com.tikkeul.app.domain.vo.DoranBoardVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

/*
@Controller
@Slf4j
@RequestMapping("/doranboard/*")
@RequiredArgsConstructor
public class DoranBoardController {
    @GetMapping("selectAll")
    public void goToWriteForm(DoranBoardVO doranBoardVO){;}

    @PostMapping("selectAll")
    public RedirectView write(DoranBoardDTO doranBoardDTO){
        postService.selectAll(doranBoardDTO);
        return new RedirectView("/dorandoran/doranboard");
    }

}
*/
