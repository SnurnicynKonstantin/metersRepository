package com.metersrepository.config;

import com.metersrepository.controller.HelloController;
import com.metersrepository.persistence.dao.PersonDao;
import com.metersrepository.persistence.repository.PersonRepository;
import com.metersrepository.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetersConfig {
    @Bean
    public PersonDao personDao(PersonRepository personRepository) {
        return new PersonDao(personRepository);
    }
    @Bean
    public PersonService personService(PersonDao personDao) {
        return new PersonService(personDao);
    }
    @Bean
    public HelloController helloController(PersonService personService) {
        return new HelloController(personService);
    }
}
