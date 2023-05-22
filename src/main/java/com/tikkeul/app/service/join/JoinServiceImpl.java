package com.tikkeul.app.service.join;

import com.tikkeul.app.dao.UserDAO;
import com.tikkeul.app.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Qualifier("join") @Primary
public class JoinServiceImpl implements JoinService{
    public final UserDAO userDAO;
    @Override
    public Optional<UserVO> checkId(String identification) {
    return userDAO.findById(identification);
    }

    @Override
    public void join(UserVO userVO) {
    userDAO.save(userVO);
    }

    @Override
    public Optional<Long> login(String identification, String password) {
        return Optional.empty();
    }
}
