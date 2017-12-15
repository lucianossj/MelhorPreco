
package model.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBControl {

    Connection con;
    PreparedStatement stmt;
    ResultSet rs;

    public DBControl() throws SQLException {

        con = getConnection();

    }

    public static Connection getConnection() throws SQLException {

        Connection con = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/melhorpreco", "root", "");

        return con;

    }

    public void closeConnection() throws SQLException {

        con.close();

    }
    
}
