/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class Employee {
    
    private String name;
    private int empID;

    public Employee() {
    }

    public Employee(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Employee{" + "Name=" + name + ", EmpID=" + empID + '}';
    }
    
    

   
    
    
    
}
