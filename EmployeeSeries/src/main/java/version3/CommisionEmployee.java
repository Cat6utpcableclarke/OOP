/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author light
 */
public class CommisionEmployee extends Employee {

    protected double totalSales;

    public CommisionEmployee(double totalSales, String fName, String mName, String lname, int EmpID) {
        super(fName, mName, lname, EmpID);
        this.totalSales = totalSales;
    }

    public CommisionEmployee(double totalSales, int EmpID) {
        super(EmpID);
        this.totalSales = totalSales;
    }

    public CommisionEmployee(double totalSales) {
        super();
        this.totalSales = totalSales;
    }

    public CommisionEmployee(String fName, String mName, String lname, int EmpID) {
        super(fName, mName, lname, EmpID);
        this.totalSales = 0;
    }

    public CommisionEmployee() {
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {

        double rate = (totalSales < 10000) ? 0.05 : (totalSales < 100000) ? 0.10 : (totalSales < 1000000) ? 0.20 : 0.30;
        return totalSales * rate;
    }

    public void displayCommisionEmployee() {
        System.out.printf("Employee Name: %s , %s, %s\n", empName.fname, empName.mname, empName.lname);
        System.out.printf("Employee ID : %d\n", EmpID);
        System.out.printf("Employee Sales : %.2f\n", totalSales);
        System.out.printf("Employee Salary : %.2f\n", this.computeSalary());
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
