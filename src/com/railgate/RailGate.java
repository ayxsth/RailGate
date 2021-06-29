package com.railgate;

public class RailGate {

    public static void main(String[] args) {
        
        new Theme().setTheme();
        java.awt.EventQueue.invokeLater(() -> {
            new LoginUI().setVisible(true);
        });
        
    }
    
}
