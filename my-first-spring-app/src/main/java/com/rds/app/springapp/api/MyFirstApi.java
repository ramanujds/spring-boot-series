package com.rds.app.springapp.api;

import com.rds.app.springapp.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApi {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/person")
    public Person getPerson(){
        return new Person("Ramanuj",30);
    }

}
