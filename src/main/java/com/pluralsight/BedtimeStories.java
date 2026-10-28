package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BedtimeStories {
    public static void main(String[] args) {
//        Start from the demo's read pattern: FileReader,
//    BufferedReader, read the first line, then while (line != null),
//        inside a try/catch with e.printStackTrace();
        try {
            // create a FileReader connected to the file
            FileReader fileReader = new FileReader("goldilocks.txt");
            // create a BufferedReader to manage the input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read one line and print it
            String line = bufferedReader.readLine();
            System.out.println(line);

            // close the reader to release the file
            bufferedReader.close();
        } catch (IOException e) {
            // print the details so the error is never hidden from you
            e.printStackTrace();
        }
    }
}
