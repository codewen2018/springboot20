package com.pt.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestDBConnector implements DBConnector{
    @Override
    public void config() {

        System.out.println("Test环境数据库");
    }
}
