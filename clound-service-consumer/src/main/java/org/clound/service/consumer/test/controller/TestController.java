package org.clound.service.consumer.test.controller;

import org.clound.service.consumer.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//在创建一个Controller 来实现 server接口  路径设为/add
@RestController
public class TestController {
	@Autowired TestService server;

	@RequestMapping(value = "/text", method = RequestMethod.GET)
	public String add() {
		return server.add();
	}
	/*@Value("${hello}")
	String url;
	@Value("${jdbc.username}")
	String username;
	@Value("${jdbc.password}")
	String password;
	@RequestMapping("/test")
	public String test(){
		return "测试环境数据源连接信息：url:"+url+",username:"+username+",password:"+password;
	}*/
}
