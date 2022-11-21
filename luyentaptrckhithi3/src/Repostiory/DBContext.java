package Repostiory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PhongTT35
 * @description FINAL TEST SU22
 */
class DBContext {
    private static Connection conn;
    public static Connection getConnection() throws SQLException{
        if(DBContext.conn== null){
          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser = "sa", dbPass = "20022003", 
                    dbUrl = "jdbc:sqlserver://localhost:1433" + ";databaseName=FINALASS_FPOLY_NET_JAVA_SM22_BL2;encrypt=false";
           DBContext.conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("kết nối thành công");
            
            
        } catch (ClassNotFoundException ex) {
         ex.printStackTrace();
        }
    }
       return conn;
}
}
