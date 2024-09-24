/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author light
 */
public class PieceEmployee extends Employee {

    private int piecesFinished;
    private double ratePerPiece;

    public PieceEmployee(int piecesFinished, double ratePerPiece, String fName, String mName, String lname, int EmpID) {
        super(fName, mName, lname, EmpID);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceEmployee() {
        super();
    }

    public PieceEmployee(String fName, String mName, String lname, int EmpID) {
        super(fName, mName, lname, EmpID);
        this.piecesFinished = 0;
        this.ratePerPiece = 0;

    }

    public PieceEmployee(int piecesFinished, double ratePerPiece, int EmpID) {
        super(EmpID);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public double computeSalary() {

        int bonus = piecesFinished / 100;
        double salary = ((piecesFinished + bonus) * ratePerPiece) + (bonus * (10 * ratePerPiece));

        return salary;
    }

    public void displayPieceEmployee() {
        System.out.printf("Employee Name: %s , %s, %s\n", empName.fname, empName.mname, empName.lname);
        System.out.printf("Employee ID : %d\n", empID);
        System.out.printf("Rate Per Piece: %.2f\n", ratePerPiece);
        System.out.printf("Pieces Finished : %d\n", piecesFinished);
        System.out.printf("Employee salary : %.2f\n", this.computeSalary());
    }
;
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
