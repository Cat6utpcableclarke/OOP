/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myprogram;

/**
 *
 * @author User
 */
public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private String Meridian;

    public String getMeridian() {
        return Meridian;
    }

    public void setMeridian(String Meridian) {
        this.Meridian = Meridian;
    }
    
    public MyTime(int hrs, int min, int sec, String Meridian) {
        setHours(hrs);
        setMinutes(min);
        setSeconds(sec);
        setMeridian(Meridian);
    }

    public void setHours(int hours) {
        this.hours = (hours <= 12 && hours > 0) ? hours : 12;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : 0;
    }
    
    
    public void tickBySecond(){
        if(seconds <59){
            seconds+=1;
        }else{
            seconds = 0;
            tickByMinute();
        }  
    }
   
    public void tickByMinute(){
        if(minutes <59){
            minutes+=1;
        }else{
            minutes = 0;
            tickByHour();
        }  
        
    }
      
    public void tickByHour(){
        if(hours <12){
            hours+=1;
        }else{
            hours = 1;
            tickByMeridian();
        }   
    }
    
    public void tickByMeridian(){
        Meridian = (Meridian == "AM")? "PM" : Meridian;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds,Meridian);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.hours;
        hash = 89 * hash + this.minutes;
        hash = 89 * hash + this.seconds;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyTime other = (MyTime) obj;
        if (this.hours != other.hours) {
            return false;
        }
        if (this.minutes != other.minutes) {
            return false;
        }
        return this.seconds == other.seconds;
    }
    
   

}
