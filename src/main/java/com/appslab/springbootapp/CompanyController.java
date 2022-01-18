package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

   public ICompanyService iCompanyService;

    @GetMapping(path = "/company")
    public Company save()
    {
        Company company = new Company("firma");
        return iCompanyService.saveCompany(company);
    }

}
