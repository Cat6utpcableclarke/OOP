/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

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

    public BasedPlusCommissionEmployee(String Name, int EmpID) {
        super(Name, EmpID);
    }

    public BasedPlusCommissionEmployee(double BaseSalary) {
        this.baseSalary = BaseSalary;
    }

    public BasedPlusCommissionEmployee(double BaseSalary, String Name, int EmpID) {
        super(Name, EmpID);
 
        this.baseSalary = BaseSalary;
    }

    public BasedPlusCommissionEmployee(double BaseSalary, double totalSales, String Name, int EmpID) {
        super(totalSales, Name, EmpID);
        this.baseSalary = BaseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double BaseSalary) {
        this.baseSalary = BaseSalary;
    }

    @Override
    public double computeSalary() {

       double rate = (totalSales < 10000) ?  0.05 : (totalSales < 100000) ?  0.10 : (totalSales < 1000000) ?  0.20 : 0.30;
        return (totalSales *rate)+baseSalary;
    }

    public void displayBasedPlusCommissionEmployee() {
//         System.out.printf("Employee Name : %s\n", Name);
//         System.out.printf("Employee ID : %d\n", EmpID);
//        System.out.printf("Employee Sales : %.2f\n", totalSales);
//        System.out.printf("Employee BaseSalary : %.2f\n", baseSalary);
//        System.out.printf("Employee Salary : %.2f\n", this.computeSalary());
          System.out.println(toString() + " Salary:"+computeSalary() +" "+ super.displayCommisionEmployee());

    }

    @Override
    public String toString() {
        return "BasedPlusCommissionEmployee{" + "totalSales=" + totalSales + ", BaseSalary=" + baseSalary + '}';
    }

}
