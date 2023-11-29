package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
    public static void dis(){
    String query = "select * from temp";
        Connection c=DbCon.connection;
        try {
            Statement stmt =c.createStatement();
             ResultSet result=stmt.executeQuery(query);

        while(result.next()){
            System.out.println((result.getInt(1)+"\t"
                    +result.getString(  2)+"\t"+
                    result.getString(3)+"\t"+
                    result.getString(4)));
        }
    }catch (SQLException e) {
        System.out.println("error is "+e);
    }
 }
}