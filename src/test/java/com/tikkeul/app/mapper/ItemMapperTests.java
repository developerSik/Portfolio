package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Slf4j
public class ItemMapperTests {
//    상품페이지
    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void selectAllTest(){
//        assertThat(itemMapper.selectAll()).hasSize(4);
        log.info(itemMapper.selectAll().toString());
    }

    @Test
    public void selectTest(){
        itemMapper.select(2L).ifPresent(i->log.info(i.toString()));
    }
}
