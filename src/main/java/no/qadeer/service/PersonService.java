package no.qadeer.service;

import no.qadeer.entities.Person;
import no.qadeer.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public Person getPerson(long id) {
//        return repository.getPerson(id);
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return repository.findOne(id);
    }

    public Person addPerson(Person person) {
        return repository.save(person);
    }
}
