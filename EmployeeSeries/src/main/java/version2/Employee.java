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
    
    protected String Name;
    protected int EmpID;

    public Employee() {
    }

    public Employee(String Name, int EmpID) {
        this.Name = Name;
        this.EmpID = EmpID;
    }

    public Employee(String Name) {
        this.Name = Name;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", EmpID=" + EmpID + '}';
    }
    
    

   
    
    
    
}
