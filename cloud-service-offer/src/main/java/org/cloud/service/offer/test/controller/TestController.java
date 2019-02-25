package org.cloud.service.offer.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
    private DiscoveryClient client;

	@RequestMapping(value = "/text", method = RequestMethod.GET)
	public String text(){
		return	"我访问了Service-offer";
	}
}