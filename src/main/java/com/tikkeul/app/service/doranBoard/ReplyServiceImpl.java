package com.tikkeul.app.service.doranBoard;

import com.tikkeul.app.dao.ReplyDAO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.ReplyDTO;
import com.tikkeul.app.domain.vo.ReplyVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {
    private final ReplyDAO replyDAO;

    @Override
    public List<ReplyDTO> getList(Long id, Pagination pagination) {
        return replyDAO.findAll(id, pagination);
    }

    @Override
    public void write(ReplyVO replyVO) {
        replyDAO.save(replyVO);
    }

    @Override
    public void modify(ReplyVO replyVO) {
        replyDAO.setReply(toDTO(replyVO));
    }

    @Override
    public void remove(Long id) {
        replyDAO.delete(id);
    }

    @Override
    public void removeAll(Long postId) {
        replyDAO.deleteAll(postId);
    }
}
