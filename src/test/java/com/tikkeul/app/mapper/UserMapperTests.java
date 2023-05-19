package com.tikkeul.app.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class UserMapperTests {
//  관리자페이지가 만듬
    @Autowired
    private UserMapper userMapper;

//  관리자페이지가 만듬(어드민단위 테스트)
    @Test
    public void adminSelectUserAllTest(){
      assertThat(userMapper.adminSelectUserAll()).hasSize(3);
    }

//  관리자페이지가 만듬(어드민단위 테스트)
    @Test
    public void adminDeleleUserTest(){
        userMapper.adminDeleteUser(4L);
    }
}
