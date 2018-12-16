package com.yuewen.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by peng on 2017/7/20.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class TurbineApplication {
    public static void main(String[] args){
        SpringApplication.run(TurbineApplication.class, args);
    }

}
