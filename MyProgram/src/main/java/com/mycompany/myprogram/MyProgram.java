/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.myprogram;

/**
 *
 * @author User
 */
public class MyProgram {

    public static void main(String[] args) {

        MyTime t1 = new MyTime(10, 59, 58, "AM");
        MyTime t2 = new MyTime(10, 59, 58, "AM");
        System.out.println(t1);
        t1.tickBySecond();
        System.out.println(t1);
        t1.tickBySecond();
        System.out.println(t1);
        t1.tickBySecond();

        t1.tickByHour();
        t1.tickByHour();
        t1.tickByHour();
        t1.tickByMinute();

        System.out.println(t1);
        
        t2.advanceTickBySecond(120);
        System.out.println(t2);

//        System.out.println(t.toStringx());
    }
}
