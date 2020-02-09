package com.metersrepository.service;

import com.metersrepository.persistence.dao.PersonDao;
import com.metersrepository.persistence.model.Person;

import java.util.List;

public class PersonService {

    private final PersonDao dao;

    public PersonService(PersonDao dao) {
        this.dao = dao;
    }

    public List<Person> findAll() {
        return dao.findAll();
    }
}
