package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.vo.SavingLevelVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SavingLevelMapper {
    public void insertSavingLevel(SavingLevelVO savingLevelVO);

}
