//package com.tikkeul.app.controller;
//
//import com.tikkeul.app.domain.dto.DoranBoardDTO;
//import com.tikkeul.app.domain.dto.InquiryBoardDTO;
//import com.tikkeul.app.domain.dto.Pagination;
//import com.tikkeul.app.domain.dto.Search;
//import com.tikkeul.app.domain.vo.AnswerVO;
//import com.tikkeul.app.domain.vo.UserVO;
//import com.tikkeul.app.service.admin.AdminService;
//import lombok.AllArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.view.RedirectView;
//
//import javax.servlet.http.HttpSession;
//import java.util.List;
//import java.util.Optional;
//
//
//@Controller
//@Slf4j
//@RequestMapping("/admin/*")
//@RequiredArgsConstructor
//public class AdminController {
//    private final AdminService adminService;
//
////    회원
//    @GetMapping("user/list")
//    public void list(Model model){
//        model.addAttribute("users", adminService.adminGetListUserAll());
//    }
//
////    문의
//    @GetMapping("inquiry/list")
//    public void GoToinquirylist(Pagination pagination, Search search, Model model) {
//        pagination.setTotal(adminService.getInquiryTotal(search));
//        pagination.progress();
//        model.addAttribute("inquirys", adminService.adminGetListInquiryAll(pagination, search));
//    }
//
//    @GetMapping("inquiry/read")
//    public void readInquiry(Long id, Model model, AnswerVO answerVO){
//        Optional<InquiryBoardDTO> checkInquiryBoardDTO = adminService.adminReadInquiry(id);
//        if(checkInquiryBoardDTO.isPresent()) {
//            model.addAttribute("inquiryBoard", checkInquiryBoardDTO.get());
//        }
//    }
//
//
//    @PostMapping("inquiry/write")
//    @Transactional(rollbackFor = Exception.class)
//    public RedirectView write(AnswerVO answerVO,Long id){
//        adminService.adminWriteAnswer(answerVO);
//        adminService.adminModifyInquiry(id);
//        return new RedirectView("/admin/inquiry/list");
//    }
//
//    @PostMapping("inquiry/delete")
//    @ResponseBody
//    public void removeInquiry(@RequestBody List<String> inquiryIds){
//        for (String inquiryId : inquiryIds) adminService.adminRemoveInquiry(Long.valueOf(inquiryId));
//    }
//
////    도란 게시판
//    @GetMapping("doranBoard/list")
//    public void GoToDoranBoardList(Pagination pagination, Search search, Model model){
//        pagination.setTotal(adminService.getDoranBoardTotal(search));
//        pagination.progress();
//        model.addAttribute("doranBoards", adminService.adminGetListDoranBoardAll(pagination, search));
//    }
//
//    @GetMapping("doranBoard/read")
//    public void readDoranBoard(Long id, Model model){
//        Optional<DoranBoardDTO> checkDoranBoardDTO = adminService.adminReadDoranBoard(id);
//        if(checkDoranBoardDTO.isPresent()) {
//            model.addAttribute("doranBoard", checkDoranBoardDTO.get());
//        }
////        checkDoranBoardDTO.ifPresent(doranBoardDTO -> model.addAttribute(doranBoardDTO));
////        model.addAttribute("doranBoard",adminService.adminReadDoranBoard(id));
//    }
//
//    @PostMapping("doranBoard/delete")
//    @ResponseBody
//    public void removeDoranBoard(@RequestBody List<String> doranBoardIds){
//        for (String doranBoardId : doranBoardIds ) adminService.adminRemoveDoranBoard(Long.valueOf(doranBoardId));
//    }
//
//    @GetMapping("item/list")
//    public void GoToItemList(Model model,Pagination pagination,Search search){
//        pagination.setTotal(adminService.getItemTotal(search));
//        pagination.progress();
//        model.addAttribute("items",adminService.adminGetListItemAll(pagination,search));
//    }
//
//}
