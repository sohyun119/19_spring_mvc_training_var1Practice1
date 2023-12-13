package com.application.var1Practice1.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.var1Practice1.board.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertBoard(BoardDTO boardDTO) {
		sqlSession.insert("boardMapper.insertBoard",boardDTO);
	}

	@Override
	public List<BoardDTO> selectListBoard() {
		return sqlSession.selectList("selectBoardList");
	}

	@Override
	public BoardDTO selectOneBoard(long boardId) {
		return sqlSession.selectOne("selectOneBoard", boardId);
	}

	@Override
	public void updateBoard(BoardDTO boardDTO) {
		sqlSession.update("updateBoard",boardDTO);
	}

	@Override
	public void deleteBoard(long boardId) {
		sqlSession.delete("deleteBoard", boardId);
	}

}
