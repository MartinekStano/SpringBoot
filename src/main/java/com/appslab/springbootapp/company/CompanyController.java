package com.appslab.springbootapp.company;

import com.appslab.springbootapp.address.Address;
import com.appslab.springbootapp.address.AddressRepository;
import com.appslab.springbootapp.address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.AbstractDocument;

@RestController
public class CompanyController {

    private final ICompanyService companyService;
    private final AddressRepository repository;

    public CompanyController(@Autowired ICompanyService iCompanyService, @Autowired AddressRepository repository){
        this.companyService = iCompanyService;
        this.repository = repository;
    }


    @GetMapping(path = "/company")
    public Company saveDB(@RequestBody Company company)
    {
        repository.save(company.getAddress());
        companyService.saveCompany(company);
        return company;
    }

}
