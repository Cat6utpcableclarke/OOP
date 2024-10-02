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
    MyDate bDay;
    MyDate dateHired;

    public Employee( String fName,String mName,String lName,int empID,int month,int date, int year,int month2,int date2, int year2 ) {
        this.empName = new Name (fName,mName,lName);
        this.empID = empID;
        this.bDay = new MyDate(month,date,year);
        this.dateHired = new MyDate(month2,date2,year2);
    }

    public Employee(int month,int date, int year) {
        this.bDay =  new MyDate(month,date,year);
        this.dateHired =  new MyDate(10,2,2024);
    }

    public Employee(String fName,String mName,String lName, int empID,int month,int date, int year) {
        this.empName = new Name (fName,mName,lName);
        this.empID = empID;
        this.bDay = new MyDate();
        this.dateHired =  new MyDate(month,date,year);
    }

     public Employee( String fName,String lName,int empID,int month,int date, int year,int month2,int date2, int year2 ) {
        this.empName = new Name (fName,lName);
        this.empID = empID;
        this.bDay = new MyDate(month,date,year);
        this.dateHired = new MyDate(month2,date2,year2);
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

    public MyDate getbDay() {
        return bDay;
    }

    public void setbDay(MyDate bDay) {
        this.bDay = bDay;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
     public void display(){
         
        this.toString();
    }
    @Override
    public String toString() {
        return "\nempName=" + empName + " \nempID=" + empID + ", \nbDay=" + bDay + ", \ndateHired=" + dateHired ;
    }

   

  

    
    
    
    
}
