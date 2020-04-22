package com.app.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping(value="/test",method = RequestMethod.GET,
			headers="Accept=application/json")
	@ResponseBody
	public HashMap<String,String>test(){
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		map.put("1", "OK");
		
		System.out.println(map);
		
		return map;
	}

}
