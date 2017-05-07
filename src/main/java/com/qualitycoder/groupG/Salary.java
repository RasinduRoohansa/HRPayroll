package com.qualitycoder.groupG;

/**
 * Created by pravindap on 5/7/17.
 */
public class Salary {
    private Double salary;
    private Double additions;

    public Salary(){

    }
    public Salary(Double salary){
        setSalary(salary);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getAdditions() {
        return additions;
    }

    public void setAdditions(Double additions) {
        this.additions = additions;
    }

    public Salary(Double salary, Double add){
        setAdditions(add);
        setSalary(salary);
    }

    public Double calculateNetSalary(Double grossSalary, Double salaryAddition){
        this.salary = grossSalary;
        return this.CalculateAdditions(salaryAddition);
    }

    public Double CalculateAdditions(Double salaryAddition){
        salary += salaryAddition;
        return salary;
    }
}
