package com.railgate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class ProcessUser {

    public Queue loadUsers() throws FileNotFoundException {
        Queue<BookedUsers> bookedUsers = new LinkedList<>();
        File file = new File("UserList.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String[] read = reader.nextLine().split("\t");
            bookedUsers.add(new BookedUsers(read[0], read[1], Long.parseLong(read[2]), read[3], read[4], Integer.parseInt(read[5])));
        }
        return bookedUsers;
    }

    public void writeTicket(BookedUsers bookedUser) {
        File file = new File("bookings.txt");
        try (
                FileWriter fWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
                PrintWriter writer = new PrintWriter(bufferedWriter);) {
            
            Random random = new Random();
            String[] location = bookedUser.getLocation().split("-");
            String book = String.valueOf(random.nextInt(99999 - 10000) + 10000) + "\t"
                    + String.valueOf(random.nextInt(9999 - 1000) + 1000) + "\t"
                    + location[0] + "\t"
                    + location[1] + "\t"
                    + bookedUser.getDate() + "\t"
                    + String.valueOf(bookedUser.getNum()) + "\t"
                    + "Active";
            writer.println(book);
        } catch (Exception ex) {

        }
    }

    public Queue getBookings() throws FileNotFoundException {
        Queue<String[]> bookings = new LinkedList<>();
        File file = new File("bookings.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String[] book = reader.nextLine().split("\t");
            bookings.add(book);
        }
        return bookings;
    }
}
