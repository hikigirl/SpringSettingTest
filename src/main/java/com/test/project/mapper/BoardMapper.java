package com.test.project.mapper;

import java.util.List;

import com.test.project.model.BoardDTO;

public interface BoardMapper {

	List<BoardDTO> list();

	void add(BoardDTO dto);

}
