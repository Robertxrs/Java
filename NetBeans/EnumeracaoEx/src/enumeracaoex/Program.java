
package enumeracaoex;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) throws ParseException {
       Locale.setDefault(Locale.US);
       Scanner r = new Scanner(System.in);
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter department's name: ");
        String departmentName = r.nextLine();
        System.out.println("Enter worker date: ");
        System.out.print("Name: ");
        String workerName = r.nextLine();
        System.out.print("Level: ");
        String workerLevel = r.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = r.nextDouble();
        
        
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));
        
        System.out.println("How many contracts to this worker ?");
        int n = r.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract # "+i+" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(r.next());
            System.out.print("Value per hour: ");
            double valuePerHour = r.nextDouble();
            System.out.print("Duration(hours): ");
            int hours = r.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);                        
        }
        System.out.println();
        System.out.println("Enter month and year to calculate income(MM/YYYY): ");
        String monthAndYear = r.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name "+ worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear + ": "+String.format("%.2f", worker.income(year, month)));
        
    }
    
}
