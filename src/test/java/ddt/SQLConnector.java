package ddt;

import ua.bms.osop.utils.ConfigProperties;

import java.sql.*;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!


/**
 * Created by VChubenko on 03.05.2017.
 */
public class SQLConnector {

    //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
    private String dbUrl = ConfigProperties.getProperty("dbexport.dburl");

    //Database Username
    private String username = ConfigProperties.getProperty("dbexport.dblogin");

    //Database Password
    private String password = ConfigProperties.getProperty("dbexport.dbpassword");

    private int n = 10;

    public String[][] readDB (String table, int m) throws Exception {

        try {
            //Load mysql jdbc driver
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Query to Execute
        String queryRead = "select *  from " + table + ";";
        Connection con = null;

        //Create Connection to DB
        con = DriverManager.getConnection(dbUrl, username, password);

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs = stmt.executeQuery(queryRead);

        // While Loop to iterate through all data and print results
        String[][] mas = new String[n][m];
        int i = 1;

        while (rs.next()) {

            for (int j = 0; j < m; j++) {
                mas[i][j] = rs.getString(j+2);
            }
            ++i;

        }

        // closing DB Connection
        rs.close();
        stmt.close();
        con.close();
        return mas;

    }

}

