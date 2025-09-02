package com.study.Board.repository;

import com.study.Board.entity.BoardEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    //조회수가 증가한다 -> db를 기준으로 네이티브 쿼리
    //update board_table set board_hits=board_hits+1 where id=?
    //entity를 기준으로 하기때문에 BoardEntity가 나옴.
    //BoardEntity이름을 b로 정의
    //Entity에 정의한 컬럼 boardHits 사용
    //:id 계속 바뀌는 부분 -> parameter로 받은 id
    @Modifying
    @Query(value = "update BoardEntity b set b.boardHits=b.boardHits+1 where b.id=:id")
    void updateHits(@Param("id") Long id);
}
