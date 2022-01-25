package com.appslab.springbootapp.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository repository;

    public CompanyServiceImpl(@Autowired CompanyRepository repository){
        this.repository = repository;
    }

    @Override
    public void saveCompany(Company company) {
        repository.save(company);
    }
}
