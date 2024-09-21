/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author User
 */
public class Account {
    
    
    private double curBalance = 0;
    private double avbalance = 0;
     private String accName;
    private int accNumber;
    public void setCurBalance() {
        this.curBalance = 0;
    }

    public void setAvbalance() {
        this.avbalance = 0;
    }
    

    public Account(String accName, int accNumber) {
        this.accName = accName;
        this.accNumber = accNumber;
    }
   
    
    
    public double getCurBalance() {
        return curBalance;
    }

    public double getAvbalance() {
        return avbalance;
    }
   

    

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    
    
    public boolean deposit(double amount){
        
        if(amount %100 != 0){
             return false;
         }
        curBalance+=amount;
        return true;
    };
    
     public boolean withdraw(double amount){
         
         if((amount+10) > avbalance || amount %100 != 0){
             return false;
         }
        
        avbalance-=10-(amount + 10);
        return true;
    };
     
     public double checkBalance()
     {
         getAvbalance();
         getCurBalance();
         return  getCurBalance();
     };
     
     public boolean transfer(Account another, double amount){
         
         if(!withdraw(amount)){
             return false;
         }
         another.curBalance+=amount;
         another.avbalance+=amount;
         return true;
     };
     @Override
    public String toString() {
        return "Account{" + "curBalance=" + curBalance + ", avbalance=" + avbalance + ", accName=" + accName + ", accNumber=" + accNumber + '}';
    }
    
    public void Display()
    {
        System.out.println("Account ID:"+accNumber);
        System.out.println("Account Name:"+accName);
        System.out.println("Account CurrentBalance:"+curBalance);
        System.out.println("Account AvailableBalance:"+avbalance);

    }
    
    
    public void verify(){
        
        avbalance=curBalance;
    }
}
