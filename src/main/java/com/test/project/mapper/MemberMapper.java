package com.test.project.mapper;

import com.test.project.model.UserDTO;

//쿼리 작업용 인터페이스 매퍼
public interface MemberMapper {

	UserDTO get(String username); //customuserdetailsservice

	void add(UserDTO dto); //membercontroller(insert)

}
