package com.tikkeul.app.dao;

import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    //  관리자페이지에서 회원 리스트 조회
    public List<UserVO> adminFindUserAll(){
        return  userMapper.adminSelectUserAll();
    }

    // 관리자페이지에서 회원 삭제
    public void adminDeleteUser(Long id){
        userMapper.adminDeleteUser(id);
    }

}