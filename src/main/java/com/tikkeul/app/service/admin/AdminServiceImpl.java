package com.tikkeul.app.service.admin;

import com.tikkeul.app.dao.AdminDAO;
import com.tikkeul.app.dao.UserDAO;
import com.tikkeul.app.domain.dto.InquiryBoardDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.Search;
import com.tikkeul.app.domain.vo.AnswerVO;
import com.tikkeul.app.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Qualifier("admin") @Primary
public class AdminServiceImpl implements AdminService {
    private final AdminDAO adminDAO;

    @Override
    public List<UserVO> adminGetListUserAll() {
        return adminDAO.adminFindUserAll();
    }

    @Override
    public void adminRemoveUser(Long id) {
        adminDAO.adminDeleteUser(id);
    }

    @Override
    public List<InquiryBoardDTO> adminGetListInquiryAll(Pagination pagination, Search search) {
        return adminDAO.adminFindInquiryAll(pagination, search);
    }

    @Override
    public Optional<InquiryBoardDTO> adminReadInquiry(Long id) {
        return adminDAO.adminFindInquiry(id);
    }

    @Override
    public int getInquiryTotal(Search search) {
        return adminDAO.FindCountOfInquiry(search);

    }

    @Override
    public void adminWriteAnswer(AnswerVO answerVO) {
        adminDAO.adminSaveAnswer(answerVO);
    }


}
