package com.pt.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestDBConnector implements DBConnector{
    @Override
    public void configure() {

        System.out.println("Test数据库");
    }
}
