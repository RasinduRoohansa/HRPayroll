/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitycoder.groupG;

import com.qualitycoder.groupG.types.Leave;
import com.qualitycoder.groupG.types.LeaveType;
import com.qualitycoder.groupG.types.MedicalLeave;
import com.qualitycoder.groupG.types.PersonalLeave;

/**
 *
 * @author Ashan
 */
public class LeaveFactory {
    public Leave createLeave(LeaveType leaveType) throws IllegalArgumentException{
        switch(leaveType){
            case MEDICAL :
                    return new MedicalLeave();
            case PERSONAL:
                    return new PersonalLeave();
            default :
                    throw new IllegalArgumentException();
                    
        }
    }
}
