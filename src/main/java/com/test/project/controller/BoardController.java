package com.test.project.controller;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.project.mapper.BoardMapper;
import com.test.project.model.BoardDTO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardMapper mapper; //의존주입
	
	@GetMapping("/board/list") 
	public String list(Model model){
		
		List<BoardDTO> list = mapper.list();
		model.addAttribute("list", list);
		
		return "board.list";
	}
	
	@GetMapping("/board/view") 
	public String view(Model model){
		return "board.view";
	}
	
	@GetMapping("/board/add") 
	public String add(Model model){
		return "board.add";
	}
	
	@PostMapping("/board/addok")
	public String addok(Model model, BoardDTO dto, Authentication auth) {
		System.out.println("auth: " + auth);
		//mapper.add(dto);
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/edit") 
	public String edit(Model model){
		return "board.edit";
	}
	
	@GetMapping("/board/del") 
	public String del(Model model){
		return "board.del";
	}
	
}
