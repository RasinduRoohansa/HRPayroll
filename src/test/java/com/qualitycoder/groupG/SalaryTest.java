package com.qualitycoder.groupG;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by user on 07-May-17.
 */
public class SalaryTest {

    @Test
    public void find_addition_test(){
        Salary sal = new Salary(150000.0);
        double actual = sal.CalculateAdditions(567.5);
        assertThat(actual, is(150567.5));
    }

    @Test
    public void cal_net_salary(){
        Salary sal = new Salary(150000.0,565.5);
        double actual = sal.calculateNetSalary(sal.getSalary(),sal.getAdditions());
        assertThat(actual, is(150565.5));
    }


}
