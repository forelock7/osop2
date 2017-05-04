package ddt;

import java.awt.*;
import java.sql.*;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!


/**
 * Created by VChubenko on 03.05.2017.
 */
public class SQLConnector {
    public static void  main(String[] args) throws  ClassNotFoundException, SQLException {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }


        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
        String dbUrl = "jdbc:mysql://localhost:3306/osop2";

        //Database Username
        String username = "root";

        //Database Password
        String password = "root";

        //Query to Execute
        String query = "select *  from user;";

        //Load mysql jdbc driver
        //Class.forName("com.mysql.jdbc.Driver");

        //Create Connection to DB
        Connection con = null;
        con = DriverManager.getConnection(dbUrl,username,password);

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        //int columncount = rs.getRow();
        //System. out.println(rs.getRow());

        // While Loop to iterate through all data and print results
        /*while (rs.next()){
            /*4String myName = rs.getString(2);
            String myAge = rs.getString(3);
            System. out.println(myName+"  "+myAge);
            System. out.println(rs.getRow());
        }*/




        Cursor sdb;


        // closing DB Connection
        con.close();
    }

    /*

    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=minty&password=greatsqldb");

        // Do something with the Connection
    } catch (SQLException ex) {
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }*/



}

