package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void del(int id){
        String query= "delete from temp where id=?";
        Connection c=DbCon.connection;

        try {
            PreparedStatement preparedStatement = c.prepareStatement(query);

            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();

            System.out.println("Data Deleted Successfully....!");

        }catch (SQLException e) {
            System.out.println("error is "+e);
        }
    }
}