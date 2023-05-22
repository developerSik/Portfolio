package com.tikkeul.app.controller;

import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.Search;
import com.tikkeul.app.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/item/*")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

//    김보령 작업공간
//    열매샵 제품 목록 가져오기 : list.html
    @GetMapping("list")
    public void list(Model model){
        log.info("들어옴");
        itemService.getList().stream().map(ItemDTO::toString).forEach(log::info);
        model.addAttribute("items", itemService.getList());
    }

//    열매샵 제품 상세 보기 : itemdetails.html
    @GetMapping(value = {"read", "modify"})
    public void read(Long id, Model model){
        model.addAttribute("item", itemService.read(id));
    }



}
