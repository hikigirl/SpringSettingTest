package com.test.project.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.test.project.mapper.MemberMapper;
import com.test.project.model.CustomUser;
import com.test.project.model.UserDTO;

//User -> CustomUser 사용
public class CustomUserDetailsService implements UserDetailsService{
	//DB에서 회원정보 select -> User에 집어넣기
	//1. /customlogin.do : 아이디, 비번 입력
	//2. POST + /login : 인증 처리
	//3. 2번과 더불어 loadUserByUsername() 호출됨
	
	@Autowired
	private MemberMapper mapper;

	//로그인 발생 시 같이 호출되는 메서드
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDTO dto = mapper.get(username);
		
		return dto != null ? new CustomUser(dto) : null;
	}
	
}
