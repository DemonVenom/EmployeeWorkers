
import java.io.*;
import java.util.Scanner;

public abstract class Employee {

    protected String employeeName;
    protected String employeeNumber;
    protected String hireDate;

    public Employee(String name, String id, String hire) {

        employeeName = name;
        employeeNumber = id;
        hireDate = hire;

    }


    @Override
    public String toString(){
        return String.format("Name %s, Number: %s\nHire Date: %s",
                employeeName, employeeNumber, hireDate);
    }


}


