package com.qualitycoder.groupG.types;

/**
 * @author iSeeQ on 5/7/2017.
 */
public class Overtime implements Benefit {
	private int workedHours;
	private String overTimePackage;
	private double hourlyRate;

	public Overtime(int workedHours, String overTimePackage,
	                double hourlyRate) {
		super();
		this.workedHours = workedHours;
		this.overTimePackage = overTimePackage;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculate() {
		double perHourOTAmount;
		switch (overTimePackage) {
			case "Regular":
				perHourOTAmount = (hourlyRate / 100) * 150;
				return perHourOTAmount * workedHours;
			case "Double":
				perHourOTAmount = (hourlyRate / 100) * 200;
				return perHourOTAmount * workedHours;
			default:
				return 0.00;
		}
	}

}
