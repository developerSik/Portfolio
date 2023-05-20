package com.tikkeul.app.controller;

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
    @GetMapping("list")
    public void showlist(Model model){
        model.addAttribute("items", itemService.getList());
    }

    @GetMapping("itemdetails/{id}")
    public void showItemDetails(Model model){
    }
}
