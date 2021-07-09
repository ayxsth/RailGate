package com.railgate;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Writes {

    public static void main(String[] args) throws IOException {
        File file = new File("bookings.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String[] book = reader.nextLine().split("\t");
            System.out.println(book[0]);

        }
    }
}
