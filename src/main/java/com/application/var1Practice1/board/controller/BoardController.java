package com.application.var1Practice1.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.application.var1Practice1.board.dto.BoardDTO;
import com.application.var1Practice1.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/addBoard")
	public ModelAndView addBoard() {
		return new ModelAndView("board/addBoard");
	}
	
	@PostMapping("/addBoard")
	@ResponseBody
	public String addBoard(@ModelAttribute BoardDTO boardDTO) {
		
		boardService.addBoard(boardDTO);
		
		String jsScript = "";
				jsScript += "<script>";
				jsScript += "alert('add board');";
				jsScript += "location.href='addBoard';";
				jsScript += "</script>";
		
		return jsScript;
	}
	
	@GetMapping("/boardList")
	public ModelAndView boardList() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardList");
		mv.addObject("boardList", boardService.boardList());
		
		return mv;
	}
	
	@GetMapping("/boardDetail")
	public ModelAndView boardDetail(long boardId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardDetail");
		mv.addObject("boardDTO", boardService.boardDetail(boardId));
		
		return mv;
	}
	
	@GetMapping("/modifyBoard")
	public ModelAndView modifyBoard(long boardId) {
		return new ModelAndView("board/modifyBoard");
	}
	
	@PostMapping("/modifyBoard")
	@ResponseBody
	public String modifyBoard(@ModelAttribute BoardDTO boardDTO) {
		
		boardService.modifyBoard(boardDTO);
		
		String jsScript = "";
			jsScript += "<script>";
			jsScript += "alert('update board');";
			jsScript += "location.href='boardList';";
			jsScript += "</script>";
		
		return jsScript;
	}
	
	
	@GetMapping("/removeBoard")
	public ModelAndView removeBoard(long boardId) {
		return new ModelAndView("board/removeBoard");
	}
	
	@PostMapping("removeBoard")
	@ResponseBody
	public String postRemoveBoard(@RequestParam("boardId") long boardId) {
		
		boardService.removeBoard(boardId);
		
		String jsScript = "";
			jsScript += "<script>";
			jsScript += "alert('delete board');";
			jsScript += "location.href='boardList';";
			jsScript += "</script>";
		
		return jsScript;
	}
	

}
