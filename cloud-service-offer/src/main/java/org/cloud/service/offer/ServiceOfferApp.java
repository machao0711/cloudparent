package org.cloud.service.offer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 搭建服务提供者
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceOfferApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceOfferApp.class).web(true).run(args);
	}
}
