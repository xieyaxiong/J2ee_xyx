package com.xyx.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TestControl {
	
	
	@RequestMapping("xx.do")
	public void xx(String xx){
		System.out.println(xx);
	}

}
