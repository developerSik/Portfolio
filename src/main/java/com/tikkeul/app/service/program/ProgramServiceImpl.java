package com.tikkeul.app.service.program;

import com.tikkeul.app.dao.SavingLevelDAO;
import com.tikkeul.app.domain.vo.SavingLevelVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("program") @Primary
public class ProgramServiceImpl implements ProgramService{
    private final SavingLevelDAO savingLevelDAO;


    @Override
    public void writeSavingLevel(SavingLevelVO savingLevelVO) {
        savingLevelDAO.saveSavingLevel(savingLevelVO);

    }
}
