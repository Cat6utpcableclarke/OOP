/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author light
 */
public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String name, int empID) {
        super(name, empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(String name, int empID) {
        super(name, empID);
    }

    public HourlyEmployee() {
    }
    
    public HourlyEmployee(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getEmpID() {
        return empID;
    }

    @Override
    public void setEmpID(int empID) {
        this.empID = empID;
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

        double salary = (totalHoursWorked > 40) ? this.ratePerHour * 40 + (this.ratePerHour *1.50)
                : totalHoursWorked * ratePerHour;

        return salary;
    }

    ;
    
    public void displayHourlyEmployee() {
//        System.out.printf("Employee Name : %s\n", Name);
//        System.out.printf("Employee ID : %d\n", EmpID);
//        System.out.printf("Employee rate : %.2f\n", ratePerHour);
//        System.out.printf("Employee hours : %.2f\n", totalHoursWorked);
//        System.out.printf("Employee salary : %.2f\n", this.computeSalary());
          System.out.println(toString() + " Salary:"+computeSalary() +" "+ super.toString());
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
