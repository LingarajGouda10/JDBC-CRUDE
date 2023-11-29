package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpInsert {
    public static void add(int id,String n,double a,int d){
        String sql = "Insert into temp values(?,?,?,?)";
        Connection c=DbCon.connection;

        try {
            if(DbCon.connection != null) {
                PreparedStatement preparedStatement = c.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, n);
                preparedStatement.setDouble(3, a);
                preparedStatement.setInt(4, d);
                preparedStatement.execute();
                System.out.println("added successfully");
            }
            else {
                System.out.println("Connection is null. Cannot execute the query.");
            }
        } catch (SQLException e) {
            System.out.println("error"+e);
        }

    }

}
