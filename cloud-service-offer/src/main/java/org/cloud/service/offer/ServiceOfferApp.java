package org.cloud.service.offer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 搭建服务提供者
 */
@EnableDiscoveryClient
@EnableConfigServer // 激活该应用为配置文件服务器：读取远程配置文件，转换为rest接口服务
@SpringBootApplication
public class ServiceOfferApp {
	public static void main(String[] args) {
		SpringApplication.run(ServiceOfferApp.class, args);
	}
}
