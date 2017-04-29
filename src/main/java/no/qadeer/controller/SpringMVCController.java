package no.qadeer.controller;

import no.qadeer.entities.Person;
import no.qadeer.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/person")
public class SpringMVCController {

    @Autowired
    PersonService service;

    @RequestMapping(method = RequestMethod.GET)
    public Person getPerson(@RequestParam long id) {
        return service.getPerson(id);
    }


    /*
    request example:
        {"name": "Qadeer", "age": "32" }
        application/json
     */
    @RequestMapping(method = RequestMethod.POST)
    public Person addPerson(@RequestBody Person person) {
        return service.addPerson(person);
//        return service.addPerson(new Person(name, age));
    }


}
