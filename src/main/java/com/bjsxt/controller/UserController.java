package com.bjsxt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjsxt.pojo.Users;

@RestController
public class UserController {
	@RequestMapping("/user") 
	public List<Users> getUsers(){ 
		List<Users> list = new ArrayList<>(); 
		list.add(new Users(1,"zhangsan",20)); 
		list.add(new Users(2,"lisi",22)); 
		list.add(new Users(3,"wangwu",20)); 
		return list; 
	}

}
