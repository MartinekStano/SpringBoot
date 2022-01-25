package com.appslab.springbootapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImp implements AddressService{

    private final AddressRepository repository;

    public AddressServiceImp(@Autowired AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveAddress(Address address) {
        repository.save(address);
    }
}
