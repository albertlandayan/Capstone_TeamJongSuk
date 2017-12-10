/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice.Controller;

import com.webservice.Model.Strings;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author albert
 */
public class mainImpl {
    
    //this.Connect(); -- use in the beginning of each Methods and use this.Connect.conn.Close() after.
    //Methods here....
 
    
    
    public String Hello(){
    
        return "Hello!";
    }
    
    
    
    
    
    
    
    
    
    //DB Connect
    public void Connect() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                   Strings.DURL, Strings.DUSERNAME, Strings.DPASSWORD);
            System.out.println("Connected");


        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());

            System.out.println("Not Connected");

        } finally {


        }

    }
}

