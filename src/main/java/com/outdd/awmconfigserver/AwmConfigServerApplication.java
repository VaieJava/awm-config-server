package com.outdd.awmconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AwmConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwmConfigServerApplication.class, args);
    }

}
