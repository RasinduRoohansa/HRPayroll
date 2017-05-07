package com.qualitycoder.groupG;

import java.util.ArrayList;

/**
 * Created by pravindap on 5/7/17.
 */
public class SalarySheet {

    private ArrayList<Employee> employees;

    public SalarySheet(){

    }

    public SalarySheet(ArrayList<Employee> employees){
        this.employees = employees;
    }

    public SalarySheet getSalarySheetForAll(){
        return new SalarySheet();
    }
}
