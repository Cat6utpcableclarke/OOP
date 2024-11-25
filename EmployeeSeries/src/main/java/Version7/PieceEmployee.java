/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version7;

/**
 *
 * @author light
 */
public class PieceEmployee extends Employee {

    private int piecesFinished;
    private double ratePerPiece;

    public PieceEmployee(int piecesFinished, double ratePerPiece, String fName, String mName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, mName, lName, empID, month, date, year, month2, date2, year2);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceEmployee(int piecesFinished, double ratePerPiece, int month, int date, int year) {
        super(month, date, year);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceEmployee(int piecesFinished, double ratePerPiece, String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(fName, mName, lName, empID, month, date, year);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceEmployee(int piecesFinished, double ratePerPiece) {
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceEmployee(int piecesFinished, double ratePerPiece, String fName, String lName, int empID, int month, int date, int year, int month2, int date2, int year2) {
        super(fName, lName, empID, month, date, year, month2, date2, year2);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceEmployee() {
    }

    public PieceEmployee(String fName, String mName, String lName, int empID, int month, int date, int year) {
        super(fName, mName, lName, empID, month, date, year);
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
        
    @Override
      public double computeSalary() {

        int bonus = piecesFinished / 100;
        double salary = ((piecesFinished + bonus) * ratePerPiece) + (bonus * (10 * ratePerPiece));

        return salary;
    }

    /**
     *
     */
    @Override
    public void display() {

        System.out.println(this + super.toString() + "\n" + "Salary : " + this.computeSalary());
    }

    ;

    @Override
    public String toString() {
        return "piecesFinished=" + piecesFinished + ", \nratePerPiece=" + ratePerPiece;
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
