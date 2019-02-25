package org.clound.service.consumer.test.controller;

import org.clound.service.consumer.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//在创建一个Controller 来实现 server接口  路径设为/add
@RestController
public class TestController {
	@Autowired TestService server;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return server.add();
	}
}
