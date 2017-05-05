package com.qualitycoder.groupG.domain;

/**
 * @author pravindap on 5/7/17.
 * @author Amila-Kumara
 */
public class Salary {
    private Double salary;
    private Double additions;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getAdditions() {
        return additions;
    }

    public void setAdditions(Double additions) {
        this.additions = additions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salary salary1 = (Salary) o;

        if (salary != null ? !salary.equals(salary1.salary) : salary1.salary != null) return false;
        return additions != null ? additions.equals(salary1.additions) : salary1.additions == null;
    }

    @Override
    public int hashCode() {
        int result = salary != null ? salary.hashCode() : 0;
        result = 31 * result + (additions != null ? additions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Salary{salary=%s, additions=%s}", salary, additions);
    }
}
