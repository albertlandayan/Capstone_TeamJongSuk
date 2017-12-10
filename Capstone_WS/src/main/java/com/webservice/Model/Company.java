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
public class Company {
    String compId;
    String compName;
    double parCompGrade;
    double finalCompGrade;

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public double getParCompGrade() {
        return parCompGrade;
    }

    public void setParCompGrade(double parCompGrade) {
        this.parCompGrade = parCompGrade;
    }

    public double getFinalCompGrade() {
        return finalCompGrade;
    }

    public void setFinalCompGrade(double finalCompGrade) {
        this.finalCompGrade = finalCompGrade;
    }
    
}
