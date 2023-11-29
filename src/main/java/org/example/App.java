package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //  System.out.println( "Hello World!" );
        DbCon.conn();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Management Application");
        while (true) {
            System.out.println("1. Add Employee\n" +
                    "2. Show All Employee\n" +
                    "3. Update the Employee \n" +
                    "4. Delete the Employee \n" +
                    "5. Show Employee based on id \n");

            System.out.println("Enter Choice: ");
            int ch = sc.nextInt();
            Connection c = DbCon.connection;
            switch (ch) {
                case 1:
                    System.out.println("enter the Id");
                    int at1 = sc.nextInt();
                    System.out.println("name");
                    String at2 = sc.next();
                    System.out.println("salary");
                    double at3 = sc.nextDouble();
                    System.out.println("age");
                    int at4 = sc.nextInt();

                    Employee e = new Employee(at1, at2, at3, at4);
                    int id = e.getId();
                    String name = e.getName();
                    double salary = e.getSalarry();
                    int age = e.getAge();
                    EmpInsert.add(id, name, salary, age);
                    break;
                case 2:
                    Read.dis();
                    break;
                case 3:
                    System.out.println("Enter the id");
                    int setid = sc.nextInt();
                    // Update.setUpdate(setid);
                    String query = "select * from temp where id=" + setid;

                    try {
                        Statement stmt = c.createStatement();
                        ResultSet result = stmt.executeQuery(query);
                        System.out.println("Id\tname\tsalary\tage");
                        while (result.next()) {
                            System.out.println(result.getInt(1) + "\t"
                                    + result.getString(2) + "\t" +
                                    result.getString(3) + "\t" +
                                    result.getString(4));
                        }
                        System.out.println("Enter the data for update");
                        System.out.println("name");
                        String up2 = sc.next();
                        System.out.println("salary");
                        double up3 = sc.nextDouble();
                        System.out.println("age");
                        int up4 = sc.nextInt();
                        Update.setUpdate(setid, up2, up3, up4);

                    } catch (SQLException ex) {
                        System.out.println("error is " + ex);
                    }
                    break;
                case 4:
                    System.out.println("Enter the id to delete");
                    int did = sc.nextInt();
                    Delete.del(did);
                    break;
                case 5:
                    System.out.println("Enter the id for specific data");
                    int sid = sc.nextInt();
                    SpecificData.dis2(sid);
                    break;

                default:
                    System.out.println("select above mentioned");
            }
            System.out.println("do you want to continue click 1 or stop click 0");
            int p = sc.nextInt();
            if (p == 0) {
                break;
            }


        }
    }
}