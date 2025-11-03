package com.test.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

//인증 객체 - 기존의 User 대신 사용
@Getter
public class CustomUser extends User{
	
	private UserDTO udto;
	
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}
	
	public CustomUser(UserDTO dto) {
		//List<AuthDTO> -> 매핑 -> List<String>
		
		super(
			dto.getId(),
			dto.getPw(), 
			List.of(new SimpleGrantedAuthority(dto.getAuth())) //user 1명은 1개의 권한만 가진다
		);
		
		this.udto = dto;
	}
}
