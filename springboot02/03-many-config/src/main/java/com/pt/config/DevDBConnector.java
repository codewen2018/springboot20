package com.pt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevDBConnector implements DBConnector{
    @Override
    public void config() {

        System.out.println("Dev环境数据库");
    }
}
