/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author light
 */
public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String fName, String mName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, mName, lName, empID, month, date, year, month2, date2, year2);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, int month, int date, int year) {
        super(month, date, year);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(fName, mName, lName, empID, month, date, year);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String fName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, lName, empID, month, date, year, month2, date2, year2);
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

        double salary = (totalHoursWorked > 40) ? this.ratePerHour * 40 + (this.ratePerHour * 1.50)
                : totalHoursWorked * ratePerHour;

        return salary;
    }

    ;
    
    /**
     *
     */
    @Override
    public void display() {
//        System.out.println(empName);
//        System.out.println(empID);
//        System.out.println(bDay);
//        System.out.println(dateHired);
//        System.out.println(this + "\n" + "Salary : " + this.computeSalary());
        System.out.println(this + super.toString() + "\nSalary: " + this.computeSalary());

    }

    @Override
    public String toString() {
        return "totalHoursWorked=" + totalHoursWorked + ", \nratePerHour=" + ratePerHour;
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
