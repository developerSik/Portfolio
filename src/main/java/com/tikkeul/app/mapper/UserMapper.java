package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
//  관리자페이지에서 회원 리스트 조회
    public List<UserVO> adminSelectUserAll();


}
