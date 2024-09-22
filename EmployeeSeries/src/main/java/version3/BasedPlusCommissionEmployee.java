/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;



/**
 *
 * @author light
 */
public class BasedPlusCommissionEmployee extends CommisionEmployee {

    private double BaseSalary;

//    private String empName;
//    private int empID;
   

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(double BaseSalary) {
        this.BaseSalary = BaseSalary;
    }

    @Override
    public double computeSalary() {

        double salary =(totalSales < 10000)?(totalSales * 0.05) + BaseSalary:(totalSales >= 10000 && totalSales < 100000)? (totalSales * 0.10) + BaseSalary:
                       (totalSales < 1000000)? (totalSales * 0.20) + BaseSalary: (totalSales * 0.30) + BaseSalary;
        return salary;
    }

    public void displayBasedPlusCommissionEmployee() {
         System.out.printf("Employee Name : %s\n", Name);
         System.out.printf("Employee ID : %d\n", EmpID);
        System.out.printf("Employee Sales : %.2f\n", totalSales);
        System.out.printf("Employee BaseSalary : %.2f\n", BaseSalary);
        System.out.printf("Employee Salary : %.2f\n", this.computeSalary());

    }

    @Override
    public String toString() {
        return "BasedPlusCommissionEmployee{" + "totalSales=" + totalSales + ", BaseSalary=" + BaseSalary + '}';
    }

}
