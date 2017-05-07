package com.qualitycoder.groupG;

import com.qualitycoder.groupG.types.TravelAllowance;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by iSeeQ on 5/7/2017.
 */
public class TravelAllowanceTest {
    @Test
    public void calculateMedicalFee_when_EmployeeHasACar(){

        boolean hasACar=true;
        TravelAllowance travelAllowance=new TravelAllowance(hasACar);
        double employeeTravelAllowance=travelAllowance.calculate();
        assertThat(employeeTravelAllowance,is(20000.0));
    }

    @Test
    public void calculateMedicalFee_when_EmployeeHasNotACar(){

        boolean hasACar=false;
        TravelAllowance travelAllowance=new TravelAllowance(hasACar);
        double employeeTravelAllowance=travelAllowance.calculate();
        assertThat(employeeTravelAllowance,is(15000.0));
    }
}
