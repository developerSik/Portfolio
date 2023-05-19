package com.tikkeul.app.service;


import com.tikkeul.app.service.admin.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class AdminServiceTests {

    @Autowired
    private AdminService adminService;

    @Test
    //  관리자페이지에서 회원 리스트 조회
    public void adminFindUserAllTest(){
        assertThat(adminService.adminGetUserList()).hasSize(2);
    }

    @Test
    // 관리자페이지에서 회원 삭제
    public void adminDeleleUserTest(){
        adminService.adminRemoveUser(9L);
    }

}

