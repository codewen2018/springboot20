package com.pt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdDBConnector implements DBConnector{
    @Override
    public void configure() {
        System.out.println("数据库配置环境Prod");
    }
}
