package org.cloud.eureka.high.one.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/*今天遇到个问题，Eureka的Server端和Client端本来已经联通成功，服务注册、发现都正常。
后来开启了验证功能，Client端向Server端注册服务时，需要验证用户名和密码*/
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
