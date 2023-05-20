package com.tikkeul.app.dao;

import com.tikkeul.app.domain.dto.InquiryBoardDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.vo.AnswerVO;
import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.AdminMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AdminDAO {

    @Autowired
    private final AdminMapper adminMapper;

    public List<UserVO> adminFindUserAll(){
        return adminMapper.adminSelectUserAll();
    }

    // 관리자페이지에서 회원 삭제
    public void adminDeleteUser(Long id){
         adminMapper.adminDeleteUser(id);
    }

    //    관리자 페이지에서 문의 내역 전체 조회
    public List<InquiryBoardDTO> adminFindInquiryAll(Pagination pagination){
        return adminMapper.adminSelectInquiryAll(pagination);
    }

    //    관리자 페이지에서 문의 내역 상세 조회
    public Optional<InquiryBoardDTO> adminFindInquiry(Long id){
        return adminMapper.adminSelectInquiry(id);
    }

    public int FindCountOfInquiry(){
        return adminMapper.selectCountOfInquiry();
    }


    //    관리자 페이지에서 문의 답변
    public void adminSaveAnswer(AnswerVO answerVO){
            adminMapper.adminInsertAnswer(answerVO);
    }


}
