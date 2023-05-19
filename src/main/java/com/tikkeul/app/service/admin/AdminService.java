package com.tikkeul.app.service.admin;

import com.tikkeul.app.domain.vo.UserVO;

import java.util.List;

public interface AdminService {
    //  관리자페이지에서 회원 리스트 조회
    public List<UserVO> adminGetUserList();

    // 관리자페이지에서 회원 삭제
    public void adminRemoveUser(Long id);

}
