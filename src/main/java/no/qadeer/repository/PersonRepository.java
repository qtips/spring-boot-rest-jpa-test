package no.qadeer.repository;

import no.qadeer.entities.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> getPersonByName(String name);

}
