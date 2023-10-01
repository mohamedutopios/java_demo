package org.example.designPattern.adapter;

public class Main {
    public static void main(String[] args) {
        Employee permanentEmployee = new PermanentEmployee("John Doe", 5000, "Manager");
        Employee temporaryEmployee = new TemporaryEmployeeAdapter(new TemporaryEmployee("Jane Doe", 100, "Assistant"));
        System.out.println(permanentEmployee.getName() + " " + permanentEmployee.getPosition() + " " + permanentEmployee.getSalary());
        System.out.println(temporaryEmployee.getName() + " " + temporaryEmployee.getPosition() + " " + temporaryEmployee.getSalary());
    }
}
