package com.appslab.springbootapp.company;

import com.appslab.springbootapp.address.Address;
import com.appslab.springbootapp.address.AddressRepository;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToOne
    private Address address;



    public Company(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }

    public Company() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress(){return address;}

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
