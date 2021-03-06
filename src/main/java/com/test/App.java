package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/")
    String hello() {
    	return "Hello World MASTER 004!";
    }
    
    private void myMethod(){
    	System.out.println("This is my method");
    }
    
    private String printMessage() {
    	return "This is printMessage in MAINTENANCE";
    }
}