package com.tikkeul.app;


import com.tikkeul.app.domain.vo.DoranBoardVO;
import com.tikkeul.app.mapper.DoranBoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DoranDoranTests {
//    도란도란 보드 최보근
    @Autowired
    private DoranBoardMapper doranBoardMapper;


    @Test
    public void insertTest(){
        DoranBoardVO doranBoardVO = new DoranBoardVO();
        doranBoardVO.setId(1L);
        doranBoardVO.setTitle("테스트 제목 1");
        doranBoardVO.setContent("테스트 내용1");
        doranBoardVO.setViewCount(1);


        doranBoardMapper.insert(doranBoardVO);
    }


}
