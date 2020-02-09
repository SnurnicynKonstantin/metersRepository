package com.metersrepository.persistence.dao;

import com.metersrepository.persistence.model.Person;
import com.metersrepository.persistence.repository.PersonRepository;
import org.assertj.core.util.Lists;

import java.util.List;

public class PersonDao {

    private final PersonRepository repo;

    public PersonDao(PersonRepository repo) {
        this.repo = repo;
    }

    public List<Person> findAll() {
        return Lists.newArrayList(repo.findAll());
    }
}
