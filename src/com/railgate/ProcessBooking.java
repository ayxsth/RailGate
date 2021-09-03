package com.railgate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class ProcessBooking {

    public Queue loadUsers() throws FileNotFoundException {
        Queue<BookedUsers> bookedUsers = new LinkedList<>();
        File file = new File("SampleUsers.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String[] read = reader.nextLine().split("\t");
            bookedUsers.add(new BookedUsers(read[0], read[1], Long.parseLong(read[2]), read[3], read[4], Integer.parseInt(read[5])));
        }
        reader.close();
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
                    + String.valueOf(bookedUser.getSeats()) + "\t"
                    + "Active";
            writer.println(book);
            writer.close();
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
        reader.close();
        return bookings;
    }

    void writeAllBookings(Queue allBookings) throws IOException {
        int i = 1;
        File file = new File("UserList.txt");
        FileWriter writer = new FileWriter(file);
        long time = System.nanoTime();
        Iterator it = allBookings.iterator();
        while (i <= 100) {
            BookedUsers bookUser = (BookedUsers) it.next();
            String book = bookUser.getFirstName() + "\t"
                    + bookUser.getLastName() + "\t"
                    + bookUser.getPhone() + "\t"
                    + bookUser.getLocation() + "\t"
                    + bookUser.getDate() + "\t"
                    + bookUser.getSeats() + "\n";
                writer.write(book);
            i++;
        }
        double finalTime = (System.nanoTime() - time) / 1000;
        System.out.println("Time Taken to write " + (i - 1) + " is "
                + finalTime + " microseconds.");
        writer.close();
    }

//    Queue removeBookings(Queue allBookings) {
//        int i;
//        long time = System.nanoTime();
//        for (i = 1; i <= 200; i++) {
//            allBookings.remove();
//        }
//        double finalTime = (double) (System.nanoTime() - time) / 1000;
//        System.out.println("Time Taken to remove " + (i - 1) + " is "
//                + finalTime + " microseconds.");
//        return allBookings;
//    }
}
