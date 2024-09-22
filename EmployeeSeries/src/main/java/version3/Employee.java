/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;



/**
 *
 * @author User
 */
public class Employee {
    
    Name empName;
    int EmpID;

    public Employee(String fName,String mName,String lname ,int EmpID) {
        this.empName = new Name(fName,mName,lname);
        this.EmpID = EmpID;
    }

    public Employee(int EmpID) {
        this.empName = new Name("xxxx","xxxx","xxxx");
        this.EmpID = EmpID;
    }
    
     public Employee() {
        this.empName = new Name("xxxx","xxxx","xxxx");
        this.EmpID = 0;
    }
 
    

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }  
}
