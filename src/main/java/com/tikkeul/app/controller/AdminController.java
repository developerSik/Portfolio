package com.tikkeul.app.controller;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;


@Controller
@Slf4j
@RequestMapping("/admin/*")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("user/list")
    public void list(Model model){
        model.addAttribute("users", adminService.adminGetListUserAll());
    }

    @GetMapping(value = {"inquiry/list", "inquiry/write"})
    public void GoToinquirylist(Pagination pagination, Search search, Model model) {
        pagination.setTotal(adminService.getInquiryTotal(search));
        pagination.progress();
        model.addAttribute("inquirys", adminService.adminGetListInquiryAll(pagination, search));
    }

    @GetMapping("inquiry/read")
    public void read(Long id, Model model, HttpSession session){
        session.setAttribute("id", id);
        model.addAttribute("id", adminService.adminReadInquiry((Long)session.getAttribute("id")).get().getId());
        model.addAttribute("name", adminService.adminReadInquiry((Long)session.getAttribute("id")).get().getName());
        model.addAttribute("identification", adminService.adminReadInquiry((Long)session.getAttribute("id")).get().getIdentification());
        model.addAttribute("inquireDate", adminService.adminReadInquiry((Long)session.getAttribute("id")).get().getInquireDate());
        model.addAttribute("inquireContent", adminService.adminReadInquiry((Long)session.getAttribute("id")).get().getInquireContent());
    }

    @PostMapping("inquiry/write")
    public RedirectView write(AnswerVO answerVO){
        adminService.adminWriteAnswer(answerVO);
        return new RedirectView("/inquiry/list");
    }



}
