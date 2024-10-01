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

    private double baseSalary;

//    private String empName;
//    private int empID;

    
    
    public BasedPlusCommissionEmployee() {

    }

    public BasedPlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, String fName, String mName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(totalSales, fName, mName, lName, empID, month, date, year, month2, date2, year2);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, int month, int date, int year) {
        super(totalSales, month, date, year);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(totalSales, fName, mName, lName, empID, month, date, year);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

   
    
    
   
    
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {

         double rate = (totalSales < 10000) ?  0.05 : (totalSales < 100000) ?  0.10 : (totalSales < 1000000) ?  0.20 : 0.30;
        return (totalSales *rate)+baseSalary;
    }

    public void displayBasedPlusCommissionEmployee() {
//         System.out.printf("Employee ID : %d\n", empID);
//        System.out.printf("Employee Sales : %.2f\n", totalSales);
//        System.out.printf("Employee BaseSalary : %.2f\n", BaseSalary);
//        System.out.printf("Employee Salary : %.2f\n", super.computeSalary()+BaseSalary);
          System.out.println(super.displayCommisionEmployee());

    }

    @Override
    public String toString() {
        return  "\nbaseSalary=" + baseSalary ;
    }

    
   

}
