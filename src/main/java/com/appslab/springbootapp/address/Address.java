package com.appslab.springbootapp.address;

import com.appslab.springbootapp.company.Company;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
public class Address {

    public Address(String street, int zipCode, String city, String state) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Company company;

    private String street;
    private int zipCode;
    private String city;
    private String state;

    public Address() {

    }
}
