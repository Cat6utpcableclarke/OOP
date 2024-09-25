package com.mycompany.myprogram;

public class MyTime {
    int hours;
    int minutes;
    int seconds;
    private String meridian;

    public String getMeridian() {
        return meridian;
    }

    public void setMeridian(String meridian) {
        this.meridian = meridian;
    }
    
    public MyTime(int hrs, int min, int sec, String meridian) {
        setHours(hrs);
        setMinutes(min);
        setSeconds(sec);
        setMeridian(meridian);
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

    public void tickBySecond() {
        if (seconds < 59) {
            seconds++;
        } else {
            seconds = 0;
            tickByMinute();
        }  
    }
   
    public void tickByMinute() {
        if (minutes < 59) {
            minutes++;
        } else {
            minutes = 0;
            tickByHour();
        }  
    }
      
    public void tickByHour() {
        if (hours < 12) {
            hours++;
        } else {
            hours = 1;
            tickByMeridian();
        }   
    }
    
    public void tickByMeridian() {
        meridian = ("AM".equals(meridian)) ? "PM" : "AM";
    }

   
    
    public void advanceTickBySecond(int length) {
 
        int totalSeconds = seconds + length;
        minutes += totalSeconds / 60;
        seconds = totalSeconds % 60;   
        adjustTime();                  
    }
    
    public void advanceTickByMinute(int length) {
        int totalMinutes = minutes + length;
        hours += totalMinutes / 60;     
        minutes = totalMinutes % 60;    
        adjustTime();                    
    }
    
    public void advanceTickByHour(int length) {
        
        hours += length;
        if (hours > 12) {
            hours = (hours % 12 == 0) ? 12 : hours % 12; 
            tickByMeridian(); 
        }
    }

    private void adjustTime() {
        
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
            adjustHour();
        }
    }

    private void adjustHour() {
       
        if (hours > 12) {
            hours = (hours % 12 == 0) ? 12 : hours % 12;
            tickByMeridian();
        }
    }

     @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, meridian);
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
