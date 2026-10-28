package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
//        Ask the user for the story's file name with a
//    Scanner, and use their answer instead of the fixed name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a story without the file extension: ");
        String story1 = scanner.next();
//        Start from the demo's read pattern: FileReader,
//        BufferedReader, read the first line, then while (line != null),
//        inside a try/catch with e.printStackTrace();
        try {
            // create a FileReader connected to the file
            FileReader fileReader = new FileReader("goldilocks.txt");
//            Read goldilocks.txt by name first
            //i actually didnt look at a demo for this part :D
            String fileName =  "goldilocks.txt";
            String fileName2 =  "mary_had_a_little_lamb.txt";

            System.out.println("fileName = " + fileName);
            // create a BufferedReader to manage the input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            //add while loop
//
            while (line != null) {
                // read one line and print it
                System.out.println(line);
                line = bufferedReader.readLine();
            }



            // close the reader to release the file
            bufferedReader.close();
        } catch (IOException e) {
            // print the details so the error is never hidden from you
            e.printStackTrace();
        }
    }
}
