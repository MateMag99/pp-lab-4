package org.example;

import org.example.employees.Employee;
import org.example.employees.Manager;
import org.example.employees.Worker;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Jamal Kingstone", 500, 0);
        employees[1] = new Worker("Bartosz Walaszek", 1000, "");
        employees[2] = new Employee("Bob Marley", 1500);
        employees[3] = new Employee("Snoop Dog", 2000);
        employees[4] = new Worker("Wiz Khalifa", 2500, "");

//        System.out.println(employees[2]);
//        employees[2].setSalary(420);
//        System.out.println(employees[2]);


        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if(!(employees[i] instanceof Manager)) {
                count++;
            }
        }
        ((Manager) employees[0]).setNumberOfSubordinates(count);
        employees[0].setSalary(7500);

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
