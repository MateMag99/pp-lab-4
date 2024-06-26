package org.example.employees;

public class Manager extends Employee{

    private int numberOfSubordinates;

    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }


    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + " " +
                "numberOfSubordinates=" + numberOfSubordinates +
                "} ";
    }
}
