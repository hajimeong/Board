package com.study.Board.service;

import com.study.Board.dto.BoardDTO;
import com.study.Board.entity.BoardEntity;
import com.study.Board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//DTO -> Entity (Entity Class에서)
//Entity -> DTO (DTO Class에서)

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO){
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
