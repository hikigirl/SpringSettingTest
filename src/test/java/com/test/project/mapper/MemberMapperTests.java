package com.test.project.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.test.project.model.UserDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
public class MemberMapperTests {
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testMapper() {
		assertNotNull(mapper);
		UserDTO dto = mapper.get("hong");
		System.out.println(dto);
		//UserDTO(id=hong, name=홍길동, pw=1111, email=hong@gmail.com, age=20, regdate=2025-11-03 15:15:04, auth=ROLE_MEMBER)
	}

}
