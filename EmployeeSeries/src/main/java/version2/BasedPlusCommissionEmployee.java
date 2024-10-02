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

    public BasedPlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, String name, int empID) {
        super(name, empID);
 
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, String name, int empID) {
        super(totalSales, name, empID);
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

      
        return super.computeSalary()+baseSalary;
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
