package com.tikkeul.app.service.admin;

import com.tikkeul.app.domain.dto.InquiryBoardDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.Search;
import com.tikkeul.app.domain.vo.AnswerVO;
import com.tikkeul.app.domain.vo.UserVO;

import java.util.List;
import java.util.Optional;


public interface AdminService {

    public List<UserVO> adminGetListUserAll();

    // 관리자페이지에서 회원 삭제
    public void adminRemoveUser(Long id);

    //    관리자 페이지에서 문의 내역 전체 조회
    public List<InquiryBoardDTO> adminGetListInquiryAll(Pagination pagination, Search search);

    //    관리자 페이지에서 문의 내역 상세 조회
    public Optional<InquiryBoardDTO> adminReadInquiry(Long id);

//    관리자 페이지에서 문의 내역 전체 개수 조회
    public int getInquiryTotal(Search search);


    //    관리자 페이지에서 문의 답변
    public void adminWriteAnswer(AnswerVO answerVO);



}
