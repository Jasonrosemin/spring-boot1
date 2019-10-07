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
    public String html() {
    	return 
    			" <ul>"
    				+ "<li>"
    					+ "<a href='/doctor/1'>William Hartnell</a></a>"
    				+"</li>"
    				+ "<li>"
    				    + "<a href='/doctor/2'>Patrick Troughton</a></a>"
    				+"</li>"
    				+ "<li>"
    				    + "<a href='/doctor/3'>Jon Pertwee</a></a>"
    				+"</li>"
    				+ "<li>"
    				    + "<a href='/doctor/4'>Tom baker</a></a>"
    				+ "</li>"
    			+ "</ul>";
    }
    
    @RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell";
	}
    
	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "Patrick Troughton";
	}
	
	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "Jon Pertwee";
	}
	
	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Tom baker";
	}
	
    

}