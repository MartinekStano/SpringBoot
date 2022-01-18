package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        companyRepository.save(company);
        return company;
    }
}
