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
    LocalDate dateApplied;


    public Employee(String fName,String mName,String lname ,int EmpID) {
        this.empName = new Name(fName,mName,lname);
        this.empID = EmpID;
    }

    public Employee(int EmpID) {
        this.empName = new Name();
        this.empID = EmpID;
    }

    public Employee(Name empName,int empID,int year,int month,int date) {
        this.empName = empName;
        this.empID = empID;
        this.dateApplied = LocalDate.of(year, month, month);
    }
    
    
    public Employee(Name empName,int empID) {
        this.empName = empName;
        this.empID = empID;
        this.dateApplied = LocalDate.now();
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
        return dateApplied;
    }

    public void setDateApplied(LocalDate dateApplied) {
        this.dateApplied = dateApplied;
    }
    
}
