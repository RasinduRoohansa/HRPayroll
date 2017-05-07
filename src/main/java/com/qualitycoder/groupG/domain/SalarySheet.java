package com.qualitycoder.groupG.domain;

import java.util.ArrayList;

/**
 * @author pravindap on 5/7/17.
 * @author Amila-Kumara
 */
public class SalarySheet {

	private ArrayList<Employee> employees;

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SalarySheet that = (SalarySheet) o;

		return employees != null ? employees.equals(that.employees) : that.employees == null;
	}

	@Override
	public int hashCode() {
		return employees != null ? employees.hashCode() : 0;
	}

	@Override
	public String toString() {
		return String.format("SalarySheet{employees=%s}", employees);
	}
}
