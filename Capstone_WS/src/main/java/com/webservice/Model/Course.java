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
public class Course {
    String courseCode;
    String section;
    String cCoord;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getcCoord() {
        return cCoord;
    }

    public void setcCoord(String cCoord) {
        this.cCoord = cCoord;
    }
    
}
