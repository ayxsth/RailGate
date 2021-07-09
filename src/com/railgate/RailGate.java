package com.railgate;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;

public class RailGate {

    static Queue<BookedUsers> bookUsers = new LinkedList<>();

    public static void main(String[] args) throws FileNotFoundException {
        ProcessUser loadUser = new ProcessUser();
        bookUsers = loadUser.loadUsers();
        new Theme().setTheme();
        java.awt.EventQueue.invokeLater(() -> {
            new LoginUI().setVisible(true);
        });

    }

    public static void print() {
        for (BookedUsers bookUser : bookUsers) {
            System.out.println(bookUser.getFirstName());
        }
    }
    
    
}
