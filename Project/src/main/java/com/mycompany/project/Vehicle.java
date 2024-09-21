/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author User
 */
public class Vehicle {
    
    private int topspeed;
    private int currspeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;

    public Vehicle(int topspeed, int currspeed, String color, String model, String manufacturer, String plateNumber, boolean disabled) {
        this.topspeed = topspeed;
        this.currspeed = currspeed;
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = disabled;
    }

   

    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }

    public int getCurrspeed() {
        return currspeed;
    }

    public void setCurrspeed(int currspeed) {
        this.currspeed = currspeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
    
    public boolean accelerate(){
        
      if(currspeed>=topspeed && disabled) { 
          return false;
      }
      currspeed+=10; 
      disabled = (currspeed > topspeed);
      
        
        
      return true;
    };
    
    
     public boolean decelerate(){
         
         if(currspeed<=0){
             return false;
         }
         currspeed-=5;
        return true;
    };
     
      @Override
    public String toString() {
        
        
             
           
        return  String.format("The %s %s %s with a plateno. %s. is accelerating from 0kph to %d ",color,manufacturer,model,plateNumber,currspeed);     
        //return "Vehicle{" + "topspeed=" + topspeed + ", currspeed=" + currspeed + ", color=" + color + ", model=" + model + ", manufacturer=" + manufacturer + ", plateNumber=" + plateNumber + ", disabled=" + disabled + '}';
    }
    
    public void display(){
        StringBuilder sb = new StringBuilder();
        
//         private int topspeed;
//    private int currspeed;
//    private String color;
//    private String model;
//    private String manufacturer;
//    private String plateNumber;
//    private boolean disabled;
        sb.append("TopSpeed:");
        sb.append(topspeed);
        sb.append("\ncurrspeed");
        sb.append(currspeed);
        sb.append("\ncolor");
        sb.append(color);
        sb.append("\nmodel:");
        sb.append(model);
        sb.append("\nmanu:");
        sb.append(manufacturer);
        sb.append("\nplateNumber");
        sb.append(plateNumber);
        sb.append("\ndisabled:");
        sb.append(disabled );
        System.out.println(sb);
    }
}
