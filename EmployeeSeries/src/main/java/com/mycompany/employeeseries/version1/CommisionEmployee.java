/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author light
 */
public class CommisionEmployee {

    private double totalSales;
    private String empName;
    private int empID;

    public CommisionEmployee() {
    }

    public CommisionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public CommisionEmployee(String empName, int empID) {
        this.totalSales = 0;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double computeSalary() {

        double salary =0.0;
       
        if (totalSales < 10000) {
            salary = totalSales * 0.05;
        } else if (totalSales < 100000) {
            salary = totalSales * 0.10;
        } else if (totalSales < 1000000) {
            salary = totalSales * 0.20;
        } else if (totalSales > 1000000) {
            salary = totalSales * 0.30;
        }
        return salary;
    }

    public void displayCommisionEmployee() {
        System.out.printf("Employee ID : %d\n", empID);
        System.out.printf("Employee Name : %s\n", empName);
        System.out.printf("Employee Sales : %.2f\n", totalSales);
        System.out.printf("Employee Salary : %.2f\n", this.computeSalary());
    }

    @Override
    public String toString() {
        return "CommisionEmployee{" + "totalSales=" + totalSales + ", empName=" + empName + ", empID=" + empID + '}';
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
