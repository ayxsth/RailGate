/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.railgate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author swors
 */
public class Writes {
    public static void main(String[] args) throws IOException {
        File file= new File("bookings.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Hey!");
        writer.close();
    }
}
