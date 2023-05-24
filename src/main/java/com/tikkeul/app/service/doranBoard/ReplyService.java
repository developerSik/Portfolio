package com.tikkeul.app.service.doranBoard;


import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.ReplyDTO;
import com.tikkeul.app.domain.vo.ReplyVO;

import java.util.List;

public interface ReplyService {
    //    댓글 목록
    public List<ReplyDTO> getList(Long id, Pagination pagination);

    //    댓글 작성
    public void write(ReplyVO replyVO);

    //    댓글 수정
    public void modify(ReplyVO replyVO);

    //    댓글 삭제
    public void remove(Long id);

    //    게시글의 댓글 전체 삭제
    public void removeAll(Long postId);

    default ReplyDTO toDTO(ReplyVO replyVO){
        ReplyDTO replyDTO = new ReplyDTO();
        replyDTO.setId(replyVO.getId());
        replyDTO.setMemberId(replyVO.getUserId());
        replyDTO.setReplyContent(replyVO.getReplyContent());
        replyDTO.setUserId(replyVO.getDoranboardId());
        replyDTO.setReplyRegisterDate(replyVO.getReplyRegisterDate());
        replyDTO.setReplyUpdateDate(replyVO.getReplyUpdateDate());
        return replyDTO;
    }
}
