package org.clound.service.consumer.test.service;

import org.clound.service.consumer.test.service.impl.TestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @FeignClient用于通知Feign组件对该接口进行代理(不需要编写接口实现)，使用者可直接通过@Autowired注入。
 * @RequestMapping表示在调用该方法时需要向/text 发送GET请求。 *
 */
@FeignClient(name="service-offer",fallback=TestServiceImpl.class)
public interface TestService {
	@RequestMapping(value = "/text", method = RequestMethod.GET)
	String add();
}
