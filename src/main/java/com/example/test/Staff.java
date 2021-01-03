package com.example.test;

import javax.persistence.*;

/*
  this the class for the staff info Table
 */

@Entity
@Table(name = "staff")
//entity class named staff
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long StaffID;

    private String Fname;
    private String Lname;
    private String Role;
    private String password;
    private String username = Fname + Lname; //username is first name + last name
    private boolean enabled;

    protected Staff() {
        /*empty constructor*/
    }

    protected Staff(long StaffID, String Fname, String Lname, String Role, String password, String username, boolean enabled) {
        super();
        this.StaffID = StaffID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Role = Role;
        this.password = password;
        this.username = username;
        this.enabled = enabled;
    }


    // GETTERS AND SETTERS
    public long getStaffID() {
        return StaffID;
    }

    public void setStaffID(long StaffID) {
        this.StaffID = StaffID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = Fname + Lname;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String toString() {
        return "StaffID: " + this.StaffID
                + ". Age:" + this.Fname
                + ". Id:" + this.Lname
                + ". Role" + this.Role
                + ". password" + this.password
                + ".username" + this.username
                + ".enabled" + this.enabled;
    } //example


}
