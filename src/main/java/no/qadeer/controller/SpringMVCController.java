package no.qadeer.controller;

import no.qadeer.entities.Person;
import no.qadeer.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class SpringMVCController {

    @Autowired
    PersonService service;

    /*
    ex:
     person/1
     */
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable("id") long id) {
        return service.getPerson(id);
    }


    /*
    request example:
        {"name": "Qadeer", "age": "32" }
        application/json
     */
    @PostMapping
    public Person addPerson(@RequestBody Person person) {
            return service.addPerson(person);
    }

    /*
    ex:
     person?name=Qadeer
     */
    @GetMapping
    public List<Person> getPersonByName(@RequestParam("name") String name){
        return service.findByName(name);
    }


}
