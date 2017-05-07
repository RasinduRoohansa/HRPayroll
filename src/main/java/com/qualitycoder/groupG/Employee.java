package com.qualitycoder.groupG;

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

    public Employee(){

    }

    public Employee(String empId, String name, Character gender, String dob, String designation, Double basicSalary,
                    Double epfContribution, String phoneNumber, String address){
        this.empId = empId;
        this.name=name;
        this.gender=gender;
        this.dob=dob;
        this.designation=designation;
        this.basicSalary=basicSalary;
        this.epfContribution=epfContribution;
        this.phoneNumber=phoneNumber;
        this.address=address;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != null ? !empId.equals(employee.empId) : employee.empId != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (gender != null ? !gender.equals(employee.gender) : employee.gender != null) return false;
        if (dob != null ? !dob.equals(employee.dob) : employee.dob != null) return false;
        if (designation != null ? !designation.equals(employee.designation) : employee.designation != null)
            return false;
        if (basicSalary != null ? !basicSalary.equals(employee.basicSalary) : employee.basicSalary != null)
            return false;
        if (epfContribution != null ? !epfContribution.equals(employee.epfContribution) : employee.epfContribution != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(employee.phoneNumber) : employee.phoneNumber != null)
            return false;
        if (address != null ? !address.equals(employee.address) : employee.address != null) return false;
        return paySheet != null ? paySheet.equals(employee.paySheet) : employee.paySheet == null;
    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        result = 31 * result + (basicSalary != null ? basicSalary.hashCode() : 0);
        result = 31 * result + (epfContribution != null ? epfContribution.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (paySheet != null ? paySheet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Employee{empId='%s', name='%s', gender=%s, dob='%s', designation='%s', basicSalary=%s, epfContribution=%s, phoneNumber='%s', address='%s', paySheet=%s}", empId, name, gender, dob, designation, basicSalary, epfContribution, phoneNumber, address, paySheet);
    }
}