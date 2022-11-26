package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;

 
public class DBcontext {
        public static final Connection GET_CONNECTION() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName = db_pm_bandienthoai;"
                + "user=sa;password=20022003;encrypt=false";
        Connection cn = DriverManager.getConnection(url);
        return cn;
    }
        
        public static void main(String[] args) throws Exception {
        GET_CONNECTION();
    }
}