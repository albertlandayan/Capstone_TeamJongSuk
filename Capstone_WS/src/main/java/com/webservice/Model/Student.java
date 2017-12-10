/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice.Model;

/**
 *
 * @author albert
 */
public class Student {
    
    String lastName;
    String firstName;
    String mI;
    String program;
    String ojtStatus;
    int studNo;

    public int getStudNo() {
        return studNo;
    }

    public void setStudNo(int studNo) {
        this.studNo = studNo;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setmI(String mI) {
        this.mI = mI;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setOjtStatus(String ojtStatus) {
        this.ojtStatus = ojtStatus;
    }
    
    
}
