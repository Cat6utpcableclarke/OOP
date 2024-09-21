/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.employeeseries;

//import com.mycompany.employeeseries.version1.*;
import version2.*;

/**
 *
 * @author light
 */
public class EmployeeSeries {

    public static void main(String[] args) {
        
        HourlyEmployee h1 = new HourlyEmployee(30, 120, "Clarke", 2310);
        HourlyEmployee h2 = new HourlyEmployee("Clarke", 2310);
        HourlyEmployee h3 = new HourlyEmployee();

        System.out.println("----------HOURLY EMPLOYEEE----------");
        h1.displayHourlyEmployee();
        System.out.println("----------");
        h2.displayHourlyEmployee();
        System.out.println("----------");
        h3.displayHourlyEmployee();

        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------COMMISION EMPLOYEEE----------");
        CommisionEmployee c1 = new CommisionEmployee();
        CommisionEmployee c2 = new CommisionEmployee("Pablo", 3439);
        CommisionEmployee c3 = new CommisionEmployee(12300, "Pablo", 3439);
        c1.displayCommisionEmployee();
        System.out.println("----------");
        c2.displayCommisionEmployee();
        System.out.println("----------");
        c3.displayCommisionEmployee();
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------PIECE EMPLOYEEE----------");
        PieceEmployee p1 = new PieceEmployee();
        PieceEmployee p2 = new PieceEmployee("Jab", 1456);
        PieceEmployee p3 = new PieceEmployee(500, 1.0, "Jack", 7890);

        p1.displayPieceEmployee();
        System.out.println("----------");
        p2.displayPieceEmployee();
        System.out.println("----------");
        p3.displayPieceEmployee();
        System.out.println("----------");
        System.out.println("----------");

        System.out.println("----------BASE PLUS COMMISSION EMPLOYEEE----------");

        BasedPlusCommissionEmployee b1 = new BasedPlusCommissionEmployee();
        BasedPlusCommissionEmployee b2 = new BasedPlusCommissionEmployee(10000, 9000, "Cole", 8888);
        BasedPlusCommissionEmployee b3 = new BasedPlusCommissionEmployee("Neto", 6969);
        b1.displayBasedPlusCommissionEmployee();
        System.out.println("----------");
        b2.displayBasedPlusCommissionEmployee();
        System.out.println("----------");
        b3.displayBasedPlusCommissionEmployee();

    }
}
