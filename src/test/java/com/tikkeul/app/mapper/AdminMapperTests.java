package com.tikkeul.app.mapper;


import com.tikkeul.app.domain.dto.InquiryBoardDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.Search;
import com.tikkeul.app.domain.vo.AnswerVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class AdminMapperTests {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void adminSelectUserAllTest(){
//        assertThat(adminMapper.adminSelectUserAll()).hasSize(2);
        log.info(adminMapper.adminSelectUserAll().toString());
    }

    @Test
    public void adminDeleteUserTest(){
        adminMapper.adminDeleteUser(12L);
    }

    @Test
    public void adminSelectAllinquiry(){
        Pagination pagination = new Pagination();
//        assertThat(adminMapper.adminSelectInquiryAll()).hasSize(2);
        pagination.setPage(1);
        adminMapper.adminSelectInquiryAll(pagination, new Search()).stream().map(InquiryBoardDTO::toString).forEach(log::info);
    }

    @Test
    public void selectCountOfInquiryTest(){
        assertThat(adminMapper.selectCountOfInquiry(new Search())).isEqualTo(63);
    }

    @Test
    public void adminSelectInquiryTest(){
        adminMapper.adminSelectInquiry(5L).map(InquiryBoardDTO::getName).ifPresent(log::info);
    }

    @Test
    public void adminInsertAnswerTest(){
        AnswerVO answerVO = new AnswerVO();
        answerVO.setAnswerContent("테스트0");
        answerVO.setInquireId(5L);
        adminMapper.adminInsertAnswer(answerVO);
    }


}

