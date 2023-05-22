package com.tikkeul.app.service.item;

import com.tikkeul.app.dao.ItemDAO;
import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.Search;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemDAO itemDAO;


    @Override
    public List<ItemDTO> getList() {
        return itemDAO.findAll();
    }

    @Override
    public Optional<ItemDTO> read(Long id) {
        return itemDAO.findById(id);
    }
}
