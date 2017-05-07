package com.qualitycoder.groupG.types;

/**
 * @author iSeeQ on 5/7/2017.
 */
public class TravelAllowance implements Benifit{

    private boolean hasACar;
    public TravelAllowance(boolean hasACar) {
        super();
        this.hasACar=hasACar;
    }

    @Override
    public double calculate() {
        if(hasACar)
            return 20000;
        else
            return 15000;
    }
}
