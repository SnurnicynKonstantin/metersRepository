package com.metersrepository.controller;

import com.metersrepository.persistence.model.Person;
import com.metersrepository.service.PersonService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@ResponseBody
@RequestMapping(path = HelloController.HELLO_ENDPOINT, produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloController {

    public static final String HELLO_ENDPOINT = "/api";

    private final PersonService service;

    public HelloController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Person>> getAllPersons() {
        return ResponseEntity.ok(service.findAll());
    }

}