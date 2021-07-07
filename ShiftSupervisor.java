
import java.io.*;
import java.util.Scanner;

public class ShiftSupervisor extends Employee {

    private double yearlySalary;
    private double yearlyBonus;

    public ShiftSupervisor(String name, String id, String hire, double salary, double yearbonus) {
        super(name, id, hire);

        yearlySalary = salary;
        yearlyBonus = yearbonus;

    }

    @Override
    public String toString(){

        return String.format("Shift Supervisor:\nName: %s\nNumber: %s\nHire Date: %s\nYearly Salary: %.2f\nYearly Bonus: %.2f\n",
                employeeName, employeeNumber, hireDate, yearlySalary, yearlyBonus);
    }




}
