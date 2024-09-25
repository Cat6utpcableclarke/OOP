/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author light
 */
public class PieceEmployee extends Employee {

    private int piecesFinished;
    private double ratePerPiece;

    public PieceEmployee() {
    }

    public PieceEmployee(String Name, int EmpID) {
        super(Name, EmpID);
    }

    public PieceEmployee(int piecesFinished, double ratePerPiece) {
        super();
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceEmployee(int piecesFinished, double ratePerPiece, String Name, int EmpID) {
        super(Name, EmpID);
        this.piecesFinished = piecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceEmployee(String Name) {
        super(Name);
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
//        System.out.printf("Employee Name: %s\n",Name);
//        System.out.printf("Employe ID: %d\n", EmpID);
//        System.out.printf("Rate Per Piece: %.2f\n", ratePerPiece);
//        System.out.printf("Pieces Finished : %d\n", piecesFinished);
//        System.out.printf("Employee salary : %.2f\n", this.computeSalary());
        System.out.println(toString() +" Salary:"+computeSalary()+" "+ super.toString());

    }
    
    
;

    @Override
    public String toString() {
        return "PieceEmployee{" + "piecesFinished=" + piecesFinished + ", ratePerPiece=" + ratePerPiece + '}';
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
