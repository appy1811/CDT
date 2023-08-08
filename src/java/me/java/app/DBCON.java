/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.java.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @authorApurva
 */
public class DBCON {
     public static Connection con;
    public static Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        // 
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdt?useUnicode=true&characterEncoding=utf-8","root","");
         //  con=DriverManager.getConnection("jdbc:mysql://node30027-iti-sawarde.cloudjiffy.net:3306/iti?useUnicode=true&characterEncoding=utf-8","root","GDDffv11799");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBCON.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        return null;
    }
}
