package com.qualitycoder.groupG;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by pravindap on 5/7/17.
 */
public class EmployeeTest {
    @Test
    public void testAddEmployee(){
    }


    @Test
    public void test_View_Employee_Details(){

        Employee emp= new Employee("E00002","JOHN COOPER",'M',
                "12/10/1983","SERGEANT",85600.0,10.0,
                "0783557787","49,Wijayaba Mawatha,Dehiwela");
        ArrayList<Employee> employees=new ArrayList<Employee>();
        employees.add(emp);

        Employee empActual=emp.viewEmployeeDetails("E00002",employees);
        Assert.assertEquals(empActual, emp);
    }
}
