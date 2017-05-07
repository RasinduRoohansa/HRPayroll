package com.qualitycoder.groupG.domain;

import java.util.ArrayList;

/**
 * @author pravindap on 5/7/17.
 * @author Amila-Kumara
 */
public class PaySheet {

    private ArrayList<Employee> employees;

    private String employeeName;
    private Double duration;
    private String designation;
    private Double basicSalary;
    private Double netSalary;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaySheet paySheet = (PaySheet) o;

        if (employees != null ? !employees.equals(paySheet.employees) : paySheet.employees != null) return false;
        if (employeeName != null ? !employeeName.equals(paySheet.employeeName) : paySheet.employeeName != null)
            return false;
        if (duration != null ? !duration.equals(paySheet.duration) : paySheet.duration != null) return false;
        if (designation != null ? !designation.equals(paySheet.designation) : paySheet.designation != null)
            return false;
        if (basicSalary != null ? !basicSalary.equals(paySheet.basicSalary) : paySheet.basicSalary != null)
            return false;
        return netSalary != null ? netSalary.equals(paySheet.netSalary) : paySheet.netSalary == null;
    }

    @Override
    public int hashCode() {
        int result = employees != null ? employees.hashCode() : 0;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        result = 31 * result + (basicSalary != null ? basicSalary.hashCode() : 0);
        result = 31 * result + (netSalary != null ? netSalary.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("PaySheet{employees=%s, employeeName='%s', duration=%s, designation='%s', basicSalary=%s, netSalary=%s}", employees, employeeName, duration, designation, basicSalary, netSalary);
    }
}
