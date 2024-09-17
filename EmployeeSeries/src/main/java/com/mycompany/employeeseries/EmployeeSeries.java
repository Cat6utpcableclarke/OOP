/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeseries;
import com.mycompany.employeeseries.version1.*;
/**
 *
 * @author light
 */
public class EmployeeSeries {

    public static void main(String[] args) {
        HourlyEmployee h1 = new HourlyEmployee(30 , 120,"Clarke", 2310);
        CommisionEmployee c1 = new  CommisionEmployee();
        PieceEmployee p1 = new PieceEmployee();
        
        h1.computeSalary();
        h1.displayHourlyEmployee();
        c1.displayCommisionEmployee();
        p1.displayPieceEmployee();
    }
}
