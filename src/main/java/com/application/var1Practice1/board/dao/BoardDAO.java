package com.application.var1Practice1.board.dao;

import java.util.List;

import com.application.var1Practice1.board.dto.BoardDTO;

public interface BoardDAO {
	
	public void insertBoard(BoardDTO boardDTO);
	public List<BoardDTO> selectListBoard();
	public BoardDTO selectOneBoard(long boardId);
	public void updateBoard(BoardDTO boardDTO);
	public void deleteBoard(long boardId);
	

}
