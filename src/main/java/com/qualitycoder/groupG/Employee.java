package com.qualitycoder.groupG;

import java.util.Date;

/**
 * Created by pravindap on 5/7/17.
 */
public class Employee {

    private String empId;
    private String name;
    private Character gender;
    private String dob;
    private String designation;
    private Double basicSalary;
    private Double epfContribution;
    private String phoneNumber;
    private String address;

    private PaySheet paySheet;

    public void addEmployee(
            String empId, String name, Character gender, String dob, String designation, Double basicSalary,
            Double epfContribution, String phoneNumber, String address){
        this.empId = empId;
    }

    public Employee viewEmployeeDetails(String empId){
             return  new Employee();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public Double getEpfContribution() {
        return epfContribution;
    }

    public void setEpfContribution(Double epfContribution) {
        this.epfContribution = epfContribution;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PaySheet getPaySheet() {
        return paySheet;
    }

    public void setPaySheet(PaySheet paySheet) {
        this.paySheet = paySheet;
    }
}