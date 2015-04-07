package com.xyx.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TestControl {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@RequestMapping("xx.do")
	public void xx(String xx){
		System.out.println("save");
		jdbcTemplate.update("insert into test(name) values('xx') ");
	}

}
