package com.application.var1Practice1.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.var1Practice1.board.dao.BoardDAO;
import com.application.var1Practice1.board.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void addBoard(BoardDTO boardDTO) {
		boardDAO.insertBoard(boardDTO);
	}

	@Override
	public List<BoardDTO> boardList() {
		return boardDAO.selectListBoard();
	}

	@Override
	public BoardDTO boardDetail(long boardId) {
		return boardDAO.selectOneBoard(boardId);
	}

	@Override
	public void modifyBoard(BoardDTO boardDTO) {
		boardDAO.updateBoard(boardDTO);
	}

	@Override
	public void removeBoard(long boardId) {
		boardDAO.deleteBoard(boardId);
	}
	
	
	

}
