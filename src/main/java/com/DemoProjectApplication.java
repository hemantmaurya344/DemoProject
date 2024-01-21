package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProjectApplication.class, args);
<<<<<<< HEAD
        System.out.println("Demo is Running");
=======
        JenkinsClass ob = new JenkinsClass();
        ob.demo();
        JenkinsAnotherClass ob1 = new JenkinsAnotherClass();
        ob1.temp();
        System.out.println("Hello i am Aniket");
        System.out.println("Hello i am Aniket 2");
        System.out.println("Hello i am Girjesh");
        System.out.println("Hello i am Jenkins");


>>>>>>> a37a4f4854c62febca1687b1a508ab05a19d47e8

    }


}
