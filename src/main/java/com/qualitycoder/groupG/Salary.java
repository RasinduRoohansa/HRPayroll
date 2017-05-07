package com.qualitycoder.groupG;

/**
 * Created by pravindap on 5/7/17.
 */
public class Salary {
    private Double salary;
    private Double additions;

    public Double calculateNetSalary(Double grossSalary, Double salaryAddition){
        this.salary = grossSalary;
        return this.CalculateAdditions(salaryAddition);
    }

    public Double CalculateAdditions(Double salaryAddition){
        salary += salaryAddition;
        return salary;
    }
}
