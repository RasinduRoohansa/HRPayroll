package com.qualitycoder.groupG.types;

/**
 * @author iSeeQ on 5/7/2017.
 */
public class MedicalFee implements Benefit {

	int employeeExperience;

	public MedicalFee(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}

	@Override
	public double calculate() {
		if (employeeExperience > 4)
			return 500000;
		else if (employeeExperience > 2)
			return 100000;
		else if (employeeExperience >= 1)
			return 50000;
		else
			return 0;

	}
}
