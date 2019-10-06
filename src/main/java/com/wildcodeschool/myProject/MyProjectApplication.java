package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
    	return  "Greetings from <a href='https://spring.io/projects/spring-boot'>Spring Boot!</a>"
    			+ " <ul>"
    				+ "<li>"
    					+ "<a href='https://en.wikipedia.org/wiki/First_Doctor'>William Hartnell</a>"
    				+"</li>"
    				+ "<li>"
    				    + "<a href='https://en.wikipedia.org/wiki/Second_Doctor'>Patrick Troughton</a>"
    				+"</li>"
    				+ "<li>"
    				    + "<a href='https://en.wikipedia.org/wiki/Third_Doctor'>Jon Pertwee</a>"
    				+"</li>"
    				+ "<li>"
    				    + "<a href='https://en.wikipedia.org/wiki/Fourth_Doctor'>Tom Baker</a>"
    				+ "</li>"
    			+ "</ul<";
    }
    

}