package com.tikkeul.app.service.program;


import com.tikkeul.app.domain.vo.SavingLevelVO;

import java.util.List;

public interface ProgramService {

//    프로그램 추가 ( 관리자 )
    public void writeSavingLevel(SavingLevelVO savingLevelVO);

//    프로그램 조회 ( 관리자 )
    public List<SavingLevelVO> getSavingLevelAll();

}
