package com.tikkeul.app.service.admin;

import com.tikkeul.app.dao.UserDAO;
import com.tikkeul.app.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("admin") @Primary
public class AdminServiceImpl implements AdminService {
    private final UserDAO userDAO;

    @Override
    public List<UserVO> adminGetUserList() {
        return userDAO.adminFindUserAll();
    }

    @Override
    public void adminRemoveUser(Long id) {
        userDAO.adminDeleteUser(id);

    }
}
