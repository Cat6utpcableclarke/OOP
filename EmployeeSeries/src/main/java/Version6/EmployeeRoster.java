/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;

import java.util.ArrayList;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    
    
    private ArrayList<Employee> emplist;

    public EmployeeRoster() {
        this.emplist = new ArrayList<>();
    }
       
    public void Add(Employee emp){
        this.emplist.add(emp);
    }
    
    public Employee delete(int id){
       
        int i;
        for(i=0;i<emplist.size();i++){
           Employee ToDel = emplist.get(i);
           if(ToDel.getEmpID() == id){
               emplist.remove(i);
               return ToDel;
           }
        }
        return null;
    }
    
    public int countHE(){
        int count = 0;
        
        for(Employee emp : this.emplist){
            if(emp instanceof HourlyEmployee){
                count++;
            }
        }
        return count;
    }
    
    
    public int countBPCE(){
        int count = 0;
        
        for(Employee emp : this.emplist){
            if(emp instanceof BasedPlusCommissionEmployee){
                count++;
            }
        }
        return count;
    }
    
    
    public int countCE(){
        int count = 0;
        
        for(Employee emp : this.emplist){
            if(emp instanceof CommisionEmployee && !(emp instanceof  BasedPlusCommissionEmployee) ){
                count++;
            }
        }
        return count;
    }
    
    
    
    public int countPE(){
        int count = 0;
        
        for(Employee emp : this.emplist){
            if(emp instanceof PieceEmployee){
                count++;
            }
        }
        return count;
    }
    
    
}
