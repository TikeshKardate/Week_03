/*
FileReader Problem 1: Read a File Line by Line Using FileReader
Problem:
Write a program that uses FileReader to read a text file line by line and print each line to the console.
Approach:
Create a FileReader object to read from the file.
Wrap the FileReader in a BufferedReader to read lines efficiently.
Use a loop to read each line using the readLine() method and print it to the console.
Close the file after reading all the lines.
*/


// Importing the essential packages to use buffer reader and file reader
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

// Public class is defined 
public class StringReaderLineToLine {

    // Main starting point of the program
    public static void main(String[] args) {
        try{

            // Path of the file is given
            String path = "D:\\Week03\\Day_04\\fileReader\\StringReaderLineToLine.txt";
        
        // File reader is created
        FileReader fr=new FileReader(path);
        String s;

        // Buffered reader is created
        BufferedReader br=new BufferedReader(fr);
        int count =0;

        while ((s = br.readLine()) != null) {
            System.out.println(s);
            count++;
        }

        System.out.println(); // For extra line space

        System.out.println("The number of lines in the given file is : "+count);

        br.close();
        }

        // Exception is shown 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}