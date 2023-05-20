package com.tikkeul.app.service.doranBoard;

import com.tikkeul.app.dao.DoranBoardDAO;
import com.tikkeul.app.domain.dto.DoranBoardDTO;
import com.tikkeul.app.domain.vo.DoranBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Qualifier("doranBoard") @Primary
public class DoranBoardServiceImpl implements DoranBoardService {
    private final DoranBoardDAO doranBoardDAO;

    @Override
    public List<DoranBoardDTO> getList() {
        return doranBoardDAO.findAll();
    }

    @Override
    public void write(DoranBoardVO doranBoardVO) {
        doranBoardDAO.save(doranBoardVO);
    }

    @Override
    public Optional<DoranBoardDTO> read(Long id) {
        return doranBoardDAO.findById(id);
    }

    @Override
    public void modify(DoranBoardDTO doranBoardDTO) {

        doranBoardDAO.setPostDTO(doranBoardDTO);
    }

    @Override
    public void remove(Long id) {
        doranBoardDAO.delete(id);
    }
}
