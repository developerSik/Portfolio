package com.tikkeul.app.controller;

import com.tikkeul.app.domain.dto.DoranBoardDTO;
import com.tikkeul.app.domain.dto.InquiryBoardDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.Search;
import com.tikkeul.app.domain.vo.AnswerVO;
import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.service.admin.AdminService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.Optional;


@Controller
@Slf4j
@RequestMapping("/admin/*")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

//    회원
    @GetMapping("user/list")
    public void list(Model model){
        model.addAttribute("users", adminService.adminGetListUserAll());
    }

//    문의
    @GetMapping("inquiry/list")
    public void GoToinquirylist(Pagination pagination, Search search, Model model) {
        pagination.setTotal(adminService.getInquiryTotal(search));
        pagination.progress();
        model.addAttribute("inquirys", adminService.adminGetListInquiryAll(pagination, search));
    }

    @GetMapping("inquiry/read")
    public void readInquiry(Long id, Model model, AnswerVO answerVO){
        Optional<InquiryBoardDTO> checkInquiryBoardDTO = adminService.adminReadInquiry(id);
        if(checkInquiryBoardDTO.isPresent()) {
            model.addAttribute("inquiryBoard", checkInquiryBoardDTO.get());
        }
    }


    @PostMapping("inquiry/write")
    public RedirectView write(AnswerVO answerVO){
        adminService.adminWriteAnswer(answerVO);
        return new RedirectView("/inquiry/list");
    }

//    도란 게시판
    @GetMapping("doranBoard/list")
    public void GoToDoranBoardList(Pagination pagination, Search search, Model model){
        pagination.setTotal(adminService.getDoranBoardTotal(search));
        pagination.progress();
        model.addAttribute("doranBoards", adminService.adminGetListDoranBoardAll(pagination, search));
    }

    @GetMapping("doranBoard/read")
    public void readDoranBoard(Long id, Model model){
        Optional<DoranBoardDTO> checkDoranBoardDTO = adminService.adminReadDoranBoard(id);
//        택1
        if(checkDoranBoardDTO.isPresent()) {
            model.addAttribute("doranBoard", checkDoranBoardDTO.get());
        }
//        checkDoranBoardDTO.ifPresent(doranBoardDTO -> model.addAttribute(doranBoardDTO)); 택2
//        model.addAttribute("doranBoard",adminService.adminReadDoranBoard(id));
    }
}
