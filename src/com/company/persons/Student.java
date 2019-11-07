package com.company.persons;

import com.company.persons.Person;

import java.util.Objects;

public class Student extends Person {
    String program;
    int year;
    double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[Person[" +
                "name=" + name +
                ", address=" + address +
                "], program=" + program +
                ", year=" + year +
                ", fee=" + fee +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return year == student.year &&
                Double.compare(student.fee, fee) == 0 &&
                program.equals(student.program);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), program, year, fee);
    }
}
