/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author datnvt
 */
public class DAO {
    public static Connection conn;
     
    public DAO(){
        if(conn == null){
            String dbUrl = "jdbc:mysql://localhost:3306/tour_db?autoReconnect=true&useSSL=false";
            String dbClass = "com.mysql.jdbc.Driver";
 
            try {
                Class.forName(dbClass);
                conn = (Connection) DriverManager.getConnection (dbUrl, "root", "Aye090318");
                System.out.println("Connect to DB");
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }  
}
