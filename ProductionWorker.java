
import java.io.*;
import java.util.Scanner;

public class ProductionWorker extends Employee {

    protected int shiftType;
    protected double hourlyPay;


    public ProductionWorker(String name, String id, String hire, int shift, double pay) {

        super(name, id, hire);
        shiftType = shift;
        hourlyPay = pay;
    }



    @Override
    public String toString(){
        return String.format("Production Worker:\nEmployee Name: %s\nEmployee Number: %s\nHire Date: %s\nShift Type: %d\nHourly Pay: %.2f\n",
                employeeName, employeeNumber, hireDate, shiftType, hourlyPay);
    }



}