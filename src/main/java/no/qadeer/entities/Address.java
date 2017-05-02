package no.qadeer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String addressLine;
    private String postalNo;

    Address() {}

    public Long getId() {
        return id;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getPostalNo() {
        return postalNo;
    }
}
