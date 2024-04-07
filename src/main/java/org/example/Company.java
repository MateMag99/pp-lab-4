package org.example;

import org.example.employees.Employee;
import org.example.employees.Manager;
import org.example.employees.Worker;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Jamal Kingstone", 500, 0);
        employees[1] = new Worker("Bartosz Walaszek", 1000, "");
        employees[2] = new Employee("Bob Marley", 1500);
        employees[3] = new Employee("Snoop Dog", 2000);
        employees[4] = new Worker("Wiz Khalifa", 2500, "");
        employees[5] = new Manager("Mike Tyson", 11500, 0);
        employees[6] = new Worker("Kapitan Bomba", 5500, "");


        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof Manager) {
                ((Manager) employees[i]).setNumberOfSubordinates(5);
                employees[i].setSalary(7500);
            } else {
                employees[i].setSalary(employees[i].getSalary() + 500);
            }
            System.out.println(employees[i]);
        }

//        for (Employee employee : employees) {
//            employee.setSalary(employee.getSalary() + 500);
//            if(employee instanceof Manager) {
//                ((Manager) employee).setNumberOfSubordinates(5);
//                ((Manager) employee).setSalary(7500);
//            }
//        }


//        System.out.println(employees[2]);
//        employees[2].setSalary(420);
//        System.out.println(employees[2]);


//        int count = 0;
//        for (int i = 0; i < employees.length; i++) {
//            if(!(employees[i] instanceof Manager)) {
//                count++;
//            }
//        }
//        ((Manager) employees[0]).setNumberOfSubordinates(count);
//        employees[0].setSalary(7500);
//
//        for (Employee emp : employees) {
//            System.out.println(emp);
//        }


    }
}
