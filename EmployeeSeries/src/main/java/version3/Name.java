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
    
   protected String fname;
   protected String mname;
   protected String lname;

    public Name() {
    }

    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Name{" + "fname=" + fname + ", mname=" + mname + ", lname=" + lname + '}';
    }

    
    
    
}

