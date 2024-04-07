package org.example;

import com.sun.security.jgss.GSSUtil;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jamal Kingstone", 500);
        employees[1] = new Employee("Bartosz Walaszek", 1000);
        employees[2] = new Employee("Bob Marley", 1500);
        employees[3] = new Employee("Snoop Dog", 2000);
        employees[4] = new Employee("Wiz Khalifa", 2500);

        System.out.println(employees[2]);
        employees[2].setSalary(420);
        System.out.println(employees[2]);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
