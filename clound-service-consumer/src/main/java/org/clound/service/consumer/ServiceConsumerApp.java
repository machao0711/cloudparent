package org.clound.service.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费方
 *
 */
@SpringBootApplication
//@EnableDiscoveryClient：让该应用注册到Euteka客户端，以获取服务发现的能力
@EnableDiscoveryClient
//@EnableFeignClients：Feign 是一个声明web服务客户端，使用Feign 创建一个接口并对它进行注解，
//它具有可插拔的注解支持包括Feign注解与JAX-RS注解SpringCloud对Feign进行了封装，使其支持SpringMVC标准注解和HttpMessageConverters。
//Feign可以 Eureka和Ribbon组合使用以支持负载均衡。
@EnableFeignClients
//@RestController
public class ServiceConsumerApp {
	public static void main( String[] args ){
		SpringApplication.run(ServiceConsumerApp.class, args);
		//new SpringApplicationBuilder(ServiceConsumerApp.class).web(true).run(args);
	}
	/*@Value("${hello}") String hello;
	@RequestMapping(value = "/hello")
	public String hello(){
		return hello;
	}*/
}
