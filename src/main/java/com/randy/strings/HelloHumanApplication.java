package com.randy.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
//	@RequestMapping("/search")
//    public String indexsearch(){
//        return "This is not a search";
//	}
	@RequestMapping("{name}")
    public String index3(@RequestParam(value="name", required=false) String name) {
		if(name == null) {
			System.out.println(name);
			return " Hello Human!";
		}else
			System.out.println(name);
        return "Hello \n" + name + "\n Welcome to SpringBoot!";
	}
}