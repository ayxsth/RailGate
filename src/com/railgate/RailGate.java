package com.railgate;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;

public class RailGate {

    static Queue<BookedUsers> bookUsers = new LinkedList<>();

    public static void main(String[] args) throws FileNotFoundException {
        ProcessBooking processBooking = new ProcessBooking();
        bookUsers = processBooking.loadUsers();
        new Theme().setTheme();
        new LoginUI().setVisible(true);

    }

}
