package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.vo.ItemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;


@Mapper
public interface ItemMapper {
//    김보령 작업공간
//    열매샵 제품 목록 가져오기 : list.html
    public List<ItemDTO> selectAll();

//    열매샵 제품 상세 보기 : itemdetails.html
    public Optional<ItemDTO> select(Long id);

}
