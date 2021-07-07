
import java.io.*;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        ProductionWorker worker1 = new ProductionWorker("Robert Henderson", "1234", "01-01-01", 1, 7.5);
        ProductionWorker worker2 = new ProductionWorker("Jimmy Newport", "2345", "02-01-01", 2, 8.5);
        ProductionWorker worker3 = new ProductionWorker("Greg Kerry", "3456", "03-01-01", 1, 9.5);
        ProductionWorker worker4 = new ProductionWorker("Suzanne Summers", "4567", "04-01-01", 2, 10.5);
        TeamLeader leader1 = new TeamLeader("Yvonne Jackson", "5678", "05-01-01", 1, 11.5, 200.50, 11, 11);
        ShiftSupervisor supervisor1 = new ShiftSupervisor("Mary Nguyen", "6789", "06-01-01", 12.5, 300.5);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(worker4);
        System.out.println(leader1);
        System.out.println(supervisor1);
        return;

    }
}