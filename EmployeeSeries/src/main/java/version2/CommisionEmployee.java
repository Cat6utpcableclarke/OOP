/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author light
 */
public class CommisionEmployee extends Employee {

    protected double totalSales;

    public CommisionEmployee() {
    }

    public CommisionEmployee(String Name, int EmpID) {
        super(Name, EmpID);
    }

    public CommisionEmployee(double totalSales, String Name, int EmpID) {
        super(Name, EmpID);
        this.totalSales = totalSales;
    }

    public CommisionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommisionEmployee(String Name) {
        super(Name);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {
        double rate = (totalSales < 10000) ?  0.05 : (totalSales < 100000) ?  0.10 : (totalSales < 1000000) ?  0.20 : 0.30;
        return totalSales * rate;
    }

    public void displayCommisionEmployee() {
//        System.out.printf("Employee Name: %s\n", Name);
//        System.out.printf("Employee Sales : %d\n",EmpID);
//        System.out.printf("Employee Sales : %.2f\n", totalSales);
//        System.out.printf("Employee Salary : %.2f\n", this.computeSalary());
          System.out.println(toString() + computeSalary()+super.Name +super.EmpID);
    }

    @Override
    public String toString() {
        return "CommisionEmployee{" + "totalSales=" + totalSales + '}';
    }
}

//CommissionEmployee
//-totalSales:double
//-empName:String
//-empID:int
//+computeSalary():double
// -> less than  10,000 - 5% sales
// -> less than 100,000 but greater than or eal to 10k - 10 % sales
// -> less than 1M - 20% sales
// -> above and equal to 1 M - 30% sales
//+displayHourlyEmployee():void
// -> Employee ID: xxx
//    Employee Name: xxx
//+toString():String
// -> similar with display
