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

    public EmployeeRoster(int max) {
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
    
     public Employee removeEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (emplist[i].getEmpID() == id) {
                Employee removedEmployee = emplist[i];

                // Shift elements left to fill the gap
                for (int j = i; j < count - 1; j++) {
                    emplist[j] = emplist[j + 1];
                }
                emplist[count - 1] = null; // Clear the last element
                count--; // Decrease the count
                return removedEmployee;
            }
        }
        return null; // Return null if not found
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
    
     public int countPE(){
        int PeCount =0;
        int i=0;
        for(;i<count;i++){
            if(emplist[i] instanceof PieceEmployee){
                PeCount++;
            }
        }
        
        return PeCount;
    }
     
     
      public int countCE(){
        int CeCount =0;
        int i=0;
        for(;i<count;i++){
            if(emplist[i] instanceof CommisionEmployee && !(emplist[i] instanceof BasedPlusCommissionEmployee)){
                CeCount++;
            }
        }
        
        return CeCount;
    }
      
      
      
      
      
       public int countBPCE(){
        int BpceCount =0;
        int i=0;
        for(;i<count;i++){
            if(emplist[i] instanceof BasedPlusCommissionEmployee){
                BpceCount++;
            }
        }
        
        return BpceCount;
    }

    public void Display(){
        int i;
        
        for(i=0; i< count ; i++){
            emplist[i].display();
            System.out.println("");
        }
    }
    
    
    
    
}
