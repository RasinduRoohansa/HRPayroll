package com.qualitycoder.groupG;

import com.qualitycoder.groupG.types.MedicalFee;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by iSeeQ on 5/7/2017.
 */
public class MedicalFeeTest {
    @Test
    public void calculateMedicalFee_when_EmployeeHasOneYearExpiriance(){

        MedicalFee medicalFee=new MedicalFee(1);
        double employeeMedicalAllowance=medicalFee.calculate();
        assertThat(employeeMedicalAllowance,is(50000.0));
    }

    @Test
    public void calculateMedicalFee_when_EmployeeHasTwoYearExpiriance(){

        MedicalFee medicalFee=new MedicalFee(2);
        double employeeMedicalAllowance=medicalFee.calculate();
        assertThat(employeeMedicalAllowance,is(50000.0));
    }

    @Test
    public void calculateMedicalFee_when_EmployeeHasThreeYearsExpiriance(){

        MedicalFee medicalFee=new MedicalFee(3);
        double employeeMedicalAllowance=medicalFee.calculate();
        assertThat(employeeMedicalAllowance,is(100000.0));
    }

    @Test
    public void calculateMedicalFee_when_EmployeeHasFourYearsExpiriance(){

        MedicalFee medicalFee=new MedicalFee(4);
        double employeeMedicalAllowance=medicalFee.calculate();
        assertThat(employeeMedicalAllowance,is(100000.0));
    }

    @Test
    public void calculateMedicalFee_when_EmployeeHasFiveYearsExpiriance(){

        MedicalFee medicalFee=new MedicalFee(5);
        double employeeMedicalAllowance=medicalFee.calculate();
        assertThat(employeeMedicalAllowance,is(500000.0));
    }
}
