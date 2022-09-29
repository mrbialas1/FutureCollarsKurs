package com.futurecollars.lesson7.exercise3;

public class TicketSeller extends BaseEmployee {
    public TicketSeller(String name, String surname, int employmentYear) {
        super(name, surname, 3000, employmentYear, 0);
    }

    @Override
    public int calculateYearsOfEmployment() {
        return 2022 - getEmploymentYear();
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary();
    }
}
