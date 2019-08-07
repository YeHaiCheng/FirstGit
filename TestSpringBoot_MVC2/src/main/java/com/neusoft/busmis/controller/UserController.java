package com.neusoft.busmis.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
     
	   @RequestMapping("/test1")
	  public String test1() {
    	    return "测试test1";
     }
}
