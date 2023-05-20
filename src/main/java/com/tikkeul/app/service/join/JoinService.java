package com.tikkeul.app.service.join;

import com.tikkeul.app.domain.vo.UserVO;
import java.util.Optional;

public interface JoinService {
    //    아이디 중복검사
    public Optional<UserVO> checkId(String identification);

    //        회원가입
    public void join(UserVO userVO);

    //    로그인
    public Optional<Long> login(String identification, String password);
}
