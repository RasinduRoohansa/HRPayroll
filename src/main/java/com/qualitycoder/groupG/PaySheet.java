package com.qualitycoder.groupG;

import java.util.ArrayList;

/**
 * Created by pravindap on 5/7/17.
 */
public class PaySheet {

    private ArrayList<Employee> employees;

    private String employeeName;
    private Double duration;
    private String designation;
    private Double basicSalary;
    private Double netSalary;

    public PaySheet(){
        this.duration = 2.0;
    }

    public PaySheet(ArrayList<Employee> employees){
        this.employees = employees;
        this.duration = 2.0;
    }

    public PaySheet getEmployeePaySheetbyName(String employeeName){
        PaySheet employeePaySheet = new PaySheet();
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).getName().equals(employeeName)){
               this.setPaySheetDetails(employees.get(i), employeePaySheet);
            }
        }
        return employeePaySheet;
    }

    public PaySheet getEmployeePaySheetbyEmpID(String empployeeId){
        PaySheet employeePaySheet = new PaySheet();
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).getEmpId().equals(empployeeId)){
                this.setPaySheetDetails(employees.get(i), employeePaySheet);
            }
        }
        return employeePaySheet;
    }

    public void setPaySheetDetails(Employee employee, PaySheet employeePaySheet){
        Salary employeeSalary = new Salary();
        employeePaySheet.setEmployeeName(employee.getName());
        employeePaySheet.setDesignation(employee.getDesignation());
        employeePaySheet.setDuration(this.getDuration());
        employeePaySheet.setBasicSalary(employee.getBasicSalary());
        employeePaySheet.setNetSalary(employeeSalary.calculateNetSalary(employee.getBasicSalary(), Double.parseDouble("1000")));
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }
}
