package no.qadeer.entities;

import javax.persistence.*;

@Entity
//lack of @Table annotation -> table name = class name
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //lack of @Column  -> column assume same name as field
    private String name;
    private int age;

    // no need for public constructor as spring handles this using repository.
    Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
