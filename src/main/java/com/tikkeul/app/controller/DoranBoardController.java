package com.tikkeul.app.controller;


import com.tikkeul.app.domain.dto.DoranBoardDTO;
import com.tikkeul.app.domain.vo.DoranBoardVO;
import com.tikkeul.app.service.doranBoard.DoranBoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequestMapping("/doranboard/*")
@RequiredArgsConstructor
public class DoranBoardController {

    private final DoranBoardService doranBoardService;

    @GetMapping("doranboard")
    public void list(Model model){ model.addAttribute("doranboards", doranBoardService.getList());
    }

    @GetMapping("doranwrite")
    public void goToWriteForm(DoranBoardVO doranBoardVO){;}

    @PostMapping("doranwrite")
    public RedirectView write(DoranBoardVO doranBoardVO){
        doranBoardService.write(doranBoardVO);
        return new RedirectView("/doranboard/doranboard");
    }

    @GetMapping("read")
    public void read(Long id, Model model){
        model.addAttribute("doranboard",doranBoardService.read(id));
    }

    @GetMapping("doranmodify")
    public RedirectView modify(DoranBoardDTO doranBoardDTO, RedirectAttributes redirectAttributes){
        doranBoardService.modify(doranBoardDTO);
        redirectAttributes.addAttribute("id", doranBoardDTO.getId());
        return new RedirectView("/doranboard/doranmodify");
    }

    @PostMapping("remove")
    public RedirectView remove(Long id){
        doranBoardService.remove(id);
        return new RedirectView("/doranboard/doranboard");
    }


}
