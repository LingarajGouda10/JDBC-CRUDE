package org.example;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SpecificData {



    public static void dis2(int i){

        String query= "select * from temp where id="+i;
        Connection c=DbCon.connection;
        try {
            Statement stmt = c.createStatement();
            ResultSet result=stmt.executeQuery(query);
            System.out.println("id\tname\tsalary\tage");
            while(result.next()){
                System.out.println((result.getInt(1)+"\t"
                        +result.getString(2)+"\t"+
                        result.getString(3)+"\t"+
                        result.getString(4)));
            }

        }catch (SQLException e) {
            System.out.println("error is "+e);
        }

    }
}


