package com.railgate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
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
}
