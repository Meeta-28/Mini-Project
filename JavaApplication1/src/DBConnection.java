/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;

/**
 *
 * @author meeta
 */
public class DBConnection {
    
    static final String DB_URL ="jdbc:mysql://localhost:3306/miniproject";
        static final String USER = "root";
        static final String PASS = "28mg";
    
    public static  Connection connectDB(){
        Connection conn = null;
         try{
            //register for jdbc driver, not required
            Class.forName("com.mysql.jdbc.Driver");
            //open a connection
   conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
            
        }catch(Exception ex){
            System.out.println("There were errors while connecting to db.");
            return null;
            
        }
    }
}
