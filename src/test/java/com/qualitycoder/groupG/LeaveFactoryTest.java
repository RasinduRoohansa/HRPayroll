/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitycoder.groupG;

import static org.hamcrest.core.Is.is;

import com.qualitycoder.groupG.types.LeaveType;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Ashan
 */
public class LeaveFactoryTest {
    
    @Test
    public void test_View_Employee_Details(){
        LeaveFactory leaveFactory=new LeaveFactory();
        boolean isPaid =leaveFactory.createLeave(LeaveType.MEDICAL).isIsPaid();
        Assert.assertEquals(isPaid, true);
    }
}
