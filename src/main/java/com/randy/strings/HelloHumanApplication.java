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
	
	@RequestMapping("/")
    public String index3(@RequestParam(value="name",defaultValue = "666") String name, @RequestParam(value="last", defaultValue = "777") String lastName) {
		System.out.println(name + lastName + "String Here");
		if(name.equals("666") && lastName.equals("777")) {
			System.out.println(name + lastName + "nothing");
			return " Hello Human!";
		}
		else
			System.out.println(name + lastName);
        return "Hello \n" + name + lastName + "\n Welcome to SpringBoot!";
	}
}