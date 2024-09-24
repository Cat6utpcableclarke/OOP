/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;


/**
 *
 * @author light
 */


public class HourlyEmployee extends Employee{

    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String fName, String mName, String lname, int EmpID) {
        super(fName, mName, lname, EmpID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, int EmpID) {
        super(EmpID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, Name empName, int empID, int year, int month, int date) {
        super(empName, empID, year, month, date);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    

    
    
    
   
    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

   
    
    public double computeSalary() {

        double salary = (totalHoursWorked > 40) ? (totalHoursWorked * ratePerHour) * 1.50 : totalHoursWorked * ratePerHour;

        return salary;
    }

    ;
    
    public void displayHourlyEmployee() {
        System.out.printf("Employee Name: %s , %s, %s\n",empName.fname,empName.mname,empName.lname);
        System.out.printf("Employee ID : %d\n",empID);
        System.out.printf("Employee rate : %.2f\n", ratePerHour);
        System.out.printf("Employee hours : %.2f\n", totalHoursWorked);
        System.out.printf("Employee salary : %.2f\n", this.computeSalary());
    }

    ;
    
    
    
    @Override
    public String toString() {
        return "CommisionEmployee{" + "totalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour + '}';
    }
}
//HourlyEmployee
//-totalHoursWorked:float
//-ratePerHour:double
//-empName:String
//-empID:int
//+computeSalary():double
// -> total hours worked * rate per hour
// -> overtime will be paid 150%
// -> when it is over 40 hours
//+displayHourlyEmployee():void
// -> Employee ID: xxx
//    Employee Name: xxx
//+toString():String
// -> similar with display
