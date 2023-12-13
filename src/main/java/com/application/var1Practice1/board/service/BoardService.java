package com.application.var1Practice1.board.service;

import java.util.List;

import com.application.var1Practice1.board.dto.BoardDTO;

public interface BoardService {
	
	public void addBoard(BoardDTO boardDTO);
	public List<BoardDTO> boardList();
	public BoardDTO boardDetail(long boardId);
	public void modifyBoard(BoardDTO boardDTO);
	public void removeBoard(long boardId);
	

}
