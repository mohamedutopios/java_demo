package org.example.designPattern.adapter;

public class TemporaryEmployeeAdapter implements Employee {
    private final TemporaryEmployee temporaryEmployee;
    public TemporaryEmployeeAdapter(TemporaryEmployee temporaryEmployee) {
        this.temporaryEmployee = temporaryEmployee;
    }
    @Override
    public String getName() {
        return temporaryEmployee.getName();
    }
    @Override
    public double getSalary() {
        return temporaryEmployee.getDailyRate() * 30; // On considère qu'un mois a 30 jours
    }
    @Override
    public String getPosition() {
        return temporaryEmployee.getPosition();
    }
}

