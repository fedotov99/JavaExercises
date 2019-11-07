package com.company.persons;

import com.company.persons.Person;

import java.util.Objects;

public class Staff extends Person {
    String school;
    double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[Person[" +
                "name=" + name +
                ", address=" + address +
                "], school=" + school +
                ", pay=" + pay +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return Double.compare(staff.pay, pay) == 0 &&
                school.equals(staff.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), school, pay);
    }
}
