package com.railgate;

import java.sql.SQLException;
import java.sql.*;

public class RailGate {

    public static void main(String[] args) throws SQLException {
        Connection con = MySQLConnection.getConnection();
        System.out.println(con);
        new Theme().setTheme();
        java.awt.EventQueue.invokeLater(() -> {
            new LoginUI().setVisible(true);
        });
        
    }
    
}
