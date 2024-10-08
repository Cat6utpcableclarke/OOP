/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author light
 */
public class BasedPlusCommissionEmployee {

    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(double totalSales, double BaseSalary, String empName, int empID) {
        this.totalSales = totalSales;
        this.baseSalary = BaseSalary;
        this.empName = empName;
        this.empID = empID;
    }

    public BasedPlusCommissionEmployee(String empName, int empID) {
        this.totalSales = 0;
        this.baseSalary = 0;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double BaseSalary) {
        this.baseSalary = BaseSalary;
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

        double rate = (totalSales < 10000) ?  0.05 : (totalSales < 100000) ?  0.10 : (totalSales < 1000000) ?  0.20 : 0.30;
        return (totalSales * rate) +baseSalary;
    }

    public void displayBasedPlusCommissionEmployee() {
//        System.out.printf("Employee ID : %d\n", empID);
//        System.out.printf("Employee Name : %s\n", empName);
//        System.out.printf("Employee Sales : %.2f\n", totalSales);
//        System.out.printf("Employee BaseSalary : %.2f\n", baseSalary);
//        System.out.printf("Employee Salary : %.2f\n", this.computeSalary());
          System.out.println(toString() + computeSalary());

    }

    @Override
    public String toString() {
        return "BasedPlusCommissionEmployee{" + "totalSales=" + totalSales + ", BaseSalary=" + baseSalary + ", empName=" + empName + ", empID=" + empID + '}';
    }

}
