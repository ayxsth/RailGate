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

    public void writeTicket(String[] bookedUser) {
        File file = new File("Bookings.txt");
        try (
                FileWriter fWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
                PrintWriter writer = new PrintWriter(bufferedWriter);) {
            String book = "";
            for (String b : bookedUser) {
                book += b + "\t";
            }
//            book += "\n";
            writer.println(book);
        } catch (Exception ex) {

        }
    }
    
    public Queue getBookings() throws FileNotFoundException{
        Queue<String[]> bookings = new LinkedList<>();
        File file = new File("bookings.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String[] book = reader.next().split("\t");
            bookings.add(book);
            
        }
        return bookings;
    }
}
