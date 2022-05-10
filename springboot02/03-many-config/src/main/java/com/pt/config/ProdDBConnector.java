package com.pt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdDBConnector implements DBConnector{
    @Override
    public void config() {

        System.out.println("Prod环境数据库");
    }
}
