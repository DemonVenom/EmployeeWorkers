
import java.io.*;
import java.util.Scanner;

public class TeamLeader extends ProductionWorker {

    private double monthlyBonus;
    private int trainingHoursReq;
    private int trainingHoursAttended;

    public TeamLeader (String name, String id, String hire, int shift, double pay,
                       double monthbonus, int hrsReq, int hrsAtd) {

        super(name, id, hire, shift, pay);
        monthlyBonus = monthbonus;
        trainingHoursReq = hrsReq;
        trainingHoursAttended = hrsAtd;
    }

    @Override
    public String toString(){
        return String.format("Team Leader:\nEmployee Name: %s\nEmployee Number: %s\nHire Date: %s\nShift Type: %d\nHourly Pay: %.2f\nMonthly Bonus: %.2f\nTraining Hours Required: %d\nTraining Hours Attended: %d\n",
                employeeName, employeeNumber, hireDate, shiftType, hourlyPay, monthlyBonus, trainingHoursReq, trainingHoursAttended);
    }



}
