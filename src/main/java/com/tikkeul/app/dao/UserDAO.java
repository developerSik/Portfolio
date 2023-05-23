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




//  아이디 중복검사
    public Optional<UserVO> findById(String identification){
        return userMapper.selectById(identification);
    };

//  회원가입
    public RedirectView save(UserVO userVO){
        userVO.setLevelId(0L);
        userMapper.insert(userVO);
        return new RedirectView("/login");
    };
//  카카오로 회원가입
    public void saveaskakao(UserVO userVO){
        userVO.setLevelId(0L);
        userVO.setRegisteredType("KAKAO");
        userMapper.insertkakao(userVO);
    };
//  카카오계정으로 변경
    public void updatekakao(String identification, String registeredType){
        userMapper.updatekakao(identification,registeredType);
    }

    //    로그인
    public Optional<Long> findByUserIdAndUserPassword( String identification, String password){
        return userMapper.selectByUserIdAndUserPassword(identification,password);
    };

}
