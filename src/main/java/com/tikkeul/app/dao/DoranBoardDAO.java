package com.tikkeul.app.dao;

import com.tikkeul.app.mapper.DoranBoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DoranBoardDAO {
    private final DoranBoardMapper doranBoardMapper;

/*    //    게시글 목록
    public List<PostDTO> findAll(Pagination pagination, Search search){
        return doranBoardMapper.selectAll(pagination, search);
    }

    //    게시글 추가
    public void save(PostDTO postDTO){
        doranBoardMapper.insert(postDTO);
    }

    //    게시글 조회
    public Optional<PostDTO> findById(Long id){
        return doranBoardMapper.select(id);
    }

    //    게시글 수정
    public void setPostDTO(PostDTO postDTO){
        doranBoardMapper.update(postDTO);
    }

    //    게시글 삭제
    public void delete(Long id){
        doranBoardMapper.delete(id);
    }

    //    게시글 총 개수
    public int findCountOfPost(Search search){
        return doranBoardMapper.selectCountOfPost(search);
    }*/

}
