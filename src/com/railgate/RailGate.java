package com.railgate;

import com.railgate.login.LoginUI;
import com.railgate.theme.Theme;
import java.sql.SQLException;

public class RailGate {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Theme().setTheme();
        new LoginUI().setVisible(true);

    }

}
