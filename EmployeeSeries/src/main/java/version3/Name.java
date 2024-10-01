/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author light
 */
public class Name {
    
   protected String fName;
   protected String mName;
   protected String lName;

    public Name() {
    }

    public Name(String fname, String mname, String lname) {
        this.fName = fname;
        this.mName = mname;
        this.lName = lname;
    }

    public String getFname() {
        return fName;
    }

    public void setFname(String fname) {
        this.fName = fname;
    }

    public String getMname() {
        return mName;
    }

    public void setMname(String mname) {
        this.mName = mname;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lname) {
        this.lName = lname;
    }

    @Override
    public String toString() {
        return  fName + " " + mName + " " + lName ;
    }

    
    
    
}

