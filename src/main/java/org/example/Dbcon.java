package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

 class DbCon {

    public static Connection connection;
    public static void conn(){
        String url = "jdbc:mysql://localhost:3306/employee";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,"root","6969");
            //System.out.println(connection+" connected");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
