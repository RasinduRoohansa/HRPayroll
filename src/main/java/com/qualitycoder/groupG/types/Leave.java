/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitycoder.groupG.types;

/**
 *
 * @author Ashan
 */
public abstract class Leave {

    public Leave(boolean isPaid) {
        this.isPaid = isPaid;
    }
    
    
    private boolean isPaid;

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    
    public abstract void leave();
}
