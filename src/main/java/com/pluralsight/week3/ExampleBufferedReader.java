package com.pluralsight.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleBufferedReader {
    public static void main(String[] args) {
        try {
            // create the filereader
            FileReader fr = new FileReader("poem.txt");
            // create a bufferedreader
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            // read in a loop - alternative for understandability
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            // after reading, close the reader
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Oh no: " + e.getMessage());
        }

    }
}
