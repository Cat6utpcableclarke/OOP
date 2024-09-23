/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author light
 */
public class PieceEmployee {

    private int piecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;

    public PieceEmployee() {
    }

    public PieceEmployee(int piecesFinished, double ratePerPiece, String empName, int empID) {
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
    }

    public PieceEmployee(String empName, int empID) {
        this.piecesFinished = 0;
        this.ratePerPiece = 0;
        this.empName = empName;
        this.empID = empID;
    }

    public int getPiecesFinished() {
        return piecesFinished;
    }

    public void setPiecesFinished(int piecesFinished) {
        this.piecesFinished = piecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double computeSalary() {

        int bonus = piecesFinished / 100;
        double salary = ((piecesFinished + bonus) * ratePerPiece) + (bonus * (10 * ratePerPiece));

        return salary;
    }

    public void displayPieceEmployee() {

//        System.out.printf("Employee ID : %d\n", empID);
//        System.out.printf("Employee Name : %s\n", empName);
//        System.out.printf("Rate Per Piece: %.2f\n", ratePerPiece);
//        System.out.printf("Pieces Finished : %d\n", piecesFinished);
//        System.out.printf("Employee salary : %.2f\n", this.computeSalary());
          System.out.println(toString() + computeSalary());
    }
    
    
;

    @Override
    public String toString() {
        return "PieceEmployee{" + "piecesFinished=" + piecesFinished + ", ratePerPiece=" + ratePerPiece + ", empName=" + empName + ", empID=" + empID + '}';
    }

}

//PieceWorkerEmployee
//-totalPiecesFinished:int
//-ratePerPiece:double
//-empName:String
//-empID:int
//+computeSalary():double
// -> total pieces fionished * rate per piece
// -> in every hundred pieces finished an aditional bonus of 10*rate per piece
//+displayHourlyEmployee():void
// -> Employee ID: xxx
//    Employee Name: xxx
//+toString():String
// -> similar with display
