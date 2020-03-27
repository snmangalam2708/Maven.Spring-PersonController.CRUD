package io.zipcoder.crudapp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person create(Person p) {
        return personRepository.save(p);
    }

    public Person show(int id) {
        return personRepository.findOne(id);
    }

    public Iterable<Person> readAll() {
        return personRepository.findAll();

    }

    public Person update(Integer person_id, Person newPerson) {

        Person person1 = personRepository.findOne(person_id);
        person1.setFirstName(newPerson.getFirstName());
        person1.setLastName(newPerson.getLastName());
        return person1;
    }

    public Boolean delete(Integer id) {

        personRepository.delete(id);
        return true;
    }
}