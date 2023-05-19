package com.tikkeul.app.dao;

import com.tikkeul.app.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class UserDaoTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    //  관리자페이지에서 회원 리스트 조회
    public void adminFindUserAllTest(){
        assertThat(userDAO.adminFindUserAll()).hasSize(3);
    }

    @Test
    // 관리자페이지에서 회원 삭제
    public void adminDeleleUserTest(){
        userDAO.adminDeleteUser(7L);
    }


}
