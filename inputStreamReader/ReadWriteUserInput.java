/*
InputStreamReader Problem 2: Read User Input and Write to File Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.
Approach:
Create an InputStreamReader to read from System.in (the console).
Wrap the InputStreamReader in a BufferedReader for efficient reading.
Create a FileWriter to write to the file.
Read user input using readLine() and write the input to the file.
Repeat the process until the user enters "exit" to stop inputting.
Close the file after the input is finished.
*/

import java.io.*;

public class ReadWriteUserInput {
    public static void main(String[] args) {
        try {
            String path = "D:\\Week03\\Day_04\\inputStreamReader\\ReadWriteUserInput.txt";
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
            
            br.close();
            bw.close();
            System.out.println("Input saved to file: " + path);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}