package com.fanhua;

import com.fanhua.config.RedisConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
/**
 * 
 * @author hua.fan
 *
 */
@SpringBootApplication
@ImportResource({"classpath:disconf.xml"})//引入disconf
public class Application {

    public static void main(String args[]) {

        SpringApplication.run(Application.class, args);
    }
}


