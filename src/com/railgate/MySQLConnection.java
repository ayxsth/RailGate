package com.railgate;

import java.sql.*;

public class MySQLConnection {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/railgate",
                    "root",
                    "");
    }

}
