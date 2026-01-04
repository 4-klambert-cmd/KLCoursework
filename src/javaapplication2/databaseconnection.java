/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
//import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

/**
 *
 * @author 4-klambert
 */
public class databaseconnection {
    public static Connection ConnectDatabase(){
                
        String url = "jdbc:mysql://185.156.138.148/4-klambert";
        String user = "4-klambert";
        String password = "Duty3-Palace-Area";
        
        Connection myconnection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            myconnection = DriverManager.getConnection(url, user, password);
            System.out.println("connection good");
            return myconnection;
        } catch (Exception e){
            // stack trace shows errors
            e.printStackTrace();
            System.out.println("driver instance not successful");
            return null;
        }
    }
}
