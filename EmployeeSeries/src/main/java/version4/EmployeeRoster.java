/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version4;
import version3.*;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    
    private Employee[] emplist;
    private int count;
    private int max;

    public EmployeeRoster(Employee[] emplist, int max) {
        this.emplist = new Employee[max];
        this.count = 0;
        this.max = max;
    }
    
    public Employee[] getEmplist() {
        return emplist;
    }

    public void setEmplist(Employee[] emplist) {
        this.emplist = emplist;
    }

    public int getCount() {
        return count;
    }

  

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
    public boolean addEmployee(Employee emp){
        
        if(count < max){
        emplist[count] = emp;
        count++;
            return true;
        }else{
            return false;
        }
       
    }
    
    public Employee removeEmployee(int id){
        
        int i;
        Employee temp = new Employee();
        for (i = 0; i < count; i++) {
            if (emplist[i].getEmpID() == id) {
                temp = emplist[i];
                int j = i;
                for (; j < count; j++) {
                    emplist[j] = emplist[j + 1];
                }
            }
        }
        return temp;
    }
    
    public int countHE(){
        int HeCount =0;
        int i=0;
        for(;i<count;i++){
            if(emplist[i] instanceof HourlyEmployee){
                HeCount++;
            }
        }
        
        return HeCount;
    }

    
    
    
    
    
}
