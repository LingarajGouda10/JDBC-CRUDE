package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    public static void setUpdate(int i, String n, double a, int d){
        String query="update temp set name=?,salary=?,age=? where id=?";
        Connection c=DbCon.connection;

        try {

            PreparedStatement preparedStatement = c.prepareStatement(query);

            preparedStatement.setString(1,n);
            preparedStatement.setDouble(2,a);
            preparedStatement.setInt(3,d);
            preparedStatement.setInt(4,i);
            preparedStatement.executeUpdate();
            System.out.println("Data Updated Successfully....!");
        } catch (SQLException e) {
            System.out.println("error is "+e);
        }
    }
}
