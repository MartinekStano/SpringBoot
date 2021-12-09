package com.appslab.springbootapp.model;

public abstract class  Employee {

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    private String name;
    protected float salary;
    protected int bonus;

    public Employee(EnumEmployee enumEmployee, float salary, int bonus) {
        this.name = enumEmployee.name;
        this.salary = salary;
        this.bonus = bonus;
    }
    public void getInfo(){
        System.out.println(name+"'s salary is "+salary+" and bonus is "+bonus);
    }
}
