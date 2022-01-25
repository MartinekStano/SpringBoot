package com.appslab.springbootapp.model;

import com.appslab.springbootapp.company.Company;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employee", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer name;

    @ManyToOne(targetEntity = Company.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    @JsonIgnore
    private Company company;

    @Column(name = "company_id")
    private Integer companyId;

//
//    public float getSalary() {
//        return salary;
//    }
//
//    public int getBonus() {
//        return bonus;
//    }
//
//    private String name;
//    protected float salary;
//    protected int bonus;
//
//    public Employee(EnumEmployee enumEmployee, float salary, int bonus) {
//        this.name = enumEmployee.name;
//        this.salary = salary;
//        this.bonus = bonus;
//    }
//    public void getInfo(){
//        System.out.println(name+"'s salary is "+salary+" and bonus is "+bonus);
//    }
}
