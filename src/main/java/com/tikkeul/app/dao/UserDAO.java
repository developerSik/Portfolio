package com.tikkeul.app.dao;

import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

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
    }



//  정상수의 작업공간











//    홍윤기의 작업공간
    //    아이디 중복검사
    public Optional<UserVO> findById(String identification){
        return userMapper.selectById(identification);
    };

//    //    회원가입
    public RedirectView save(UserVO userVO){
        userMapper.insert(userVO);
        return new RedirectView("/login");
    };
//
//    //    로그인
//    public Optional<Long> selectByUserIdAndUserPassword(@Param("id") String id, @Param("password") String password){
//        return userMapper.selectByUserIdAndUserPassword(id,password);
//    };

}

