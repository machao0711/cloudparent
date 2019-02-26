package org.clound.service.consumer.test.service.impl;

import org.clound.service.consumer.test.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService{

	@Override
	public String add() {
		return "hello this is 熔断回调测试";
	}

}
