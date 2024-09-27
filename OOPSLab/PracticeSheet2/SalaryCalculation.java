package OOPSLab.PracticeSheet2;
import java.util.Scanner;

class Employee{
    private int empId;
    private String empName;
    private double basicSalary;
    private double hra;
    private double da;
    private double pf;
    private double grossSalary;
    private double netSalary;

    public Employee(int empId, String empName, double basicSalary, double hra, double da, double pf) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.pf = pf;
    }

    public void calculateGrossSalary(){
        this.grossSalary = this.basicSalary + this.hra + this.da;
    }

    public void calculateNetSalary(){
        this.netSalary = this.grossSalary - this.pf;
    }

    public void displayDetails(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

public class SalaryCalculation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Employee ID: ");
    int empId = scanner.nextInt();

    System.out.print("Enter Employee Name: ");
    scanner.nextLine();
    String empName = scanner.nextLine();

    System.out.print("Enter Basic Salary: ");
    double basicSalary = scanner.nextDouble();

    System.out.print("Enter HRA: ");
    double hra = scanner.nextDouble();

    System.out.print("Enter DA: ");
    double da = scanner.nextDouble();

    System.out.print("Enter PF: ");
    double pf = scanner.nextDouble();

    scanner.close();
    Employee emp1 = new Employee(empId, empName, basicSalary, hra, da, pf);
    emp1.calculateGrossSalary();
    emp1.calculateNetSalary();
    System.out.println();
    emp1.displayDetails();
  }
}
