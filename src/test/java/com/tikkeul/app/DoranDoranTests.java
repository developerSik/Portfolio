package com.tikkeul.app;


import com.tikkeul.app.domain.dto.DoranBoardDTO;
import com.tikkeul.app.domain.vo.DoranBoardVO;
import com.tikkeul.app.mapper.DoranBoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j

//도란도란 최보근
public class DoranDoranTests {
    @Autowired
    private DoranBoardMapper doranBoardMapper;

    @Test
    public void insertTest() {
        DoranBoardVO doranBoardVO = new DoranBoardVO();
        doranBoardVO.setId(2L);
        doranBoardVO.setTitle("테스트 제목 2");
        doranBoardVO.setContent("테스트 내용2");
        doranBoardVO.setViewCount(2);
        doranBoardVO.setUserId(2L);
        doranBoardVO.setItemId(2L);


        doranBoardMapper.insert(doranBoardVO);
    }

    @Test
    public void selectAllTest(){
        assertThat(doranBoardMapper.selectAll()).hasSize(2);
    }

    @Test
    public void selectTest() {
        doranBoardMapper.select(24L).map(DoranBoardDTO::getName).ifPresent(log::info);
    }

    @Test
    public void updateTest(){
        doranBoardMapper.select(24L).ifPresent(DoranBoardDTO -> {
            DoranBoardDTO.setContent("수정된 내용");
            doranBoardMapper.update(DoranBoardDTO);
        });
    }

    @Test
    public void deleteTest(){
        doranBoardMapper.delete(24L);
//        assertThat(doranBoardMapper.selectAll()).hasSize(1);
    }


}
