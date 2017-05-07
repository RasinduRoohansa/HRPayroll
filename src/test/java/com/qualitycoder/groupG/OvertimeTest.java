package com.qualitycoder.groupG;

import com.qualitycoder.groupG.types.Overtime;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by iSeeQ on 5/7/2017.
 */
public class OvertimeTest {
    @Test
    public void calculateOverTime_when_EmployeeFourHoursRegularOverTime(){
        int workedHours=4;
        String overTimePackage="Regular";
        double hourlyRate=1000.00;
        Overtime overtime=new Overtime(workedHours,overTimePackage,hourlyRate);
        double employeeOvertime=overtime.calculate();
        assertThat(employeeOvertime,is(6000.0));
    }

}

