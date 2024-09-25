/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;
import java.util.*;
import java.time.*;




/**
 *
 * @author User
 */
public class Employee {
    
    Name empName;
    int empID;
    LocalDate bDay;
    LocalDate dateHired;

    public Employee(String fName,String mName,String lname ,int EmpID) {
        this.empName = new Name(fName,mName,lname);
        this.empID = EmpID;
        this.dateHired = LocalDate.now();
    }

    public Employee(int EmpID) {
        this.empName = new Name();
        this.empID = EmpID;
    }

    public Employee(String fName,String mName,String lname,int empID,int year,int month,int date) {
        this.empName = new Name(fName,mName,lname);
        this.empID = empID;
        this.bDay  = LocalDate.of(year, month, date);
        this.dateHired = LocalDate.now();
    }
    
    
     public Employee() {
    }

 
     

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int EmpID) {
        this.empID = EmpID;
    }  

    public LocalDate getDateApplied() {
        return bDay ;
    }

    public void setDateApplied(LocalDate dateApplied) {
        this.bDay  = dateApplied;
    }

    @Override
    public String toString() {
        return "Employee{" + "empName=" + empName + ", empID=" + empID + ", bDay =" + bDay  + ", dateHired=" + dateHired + '}';
    }

    
    
    
    
}
