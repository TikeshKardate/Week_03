/*
FileReader Problem 2: Count the Occurrence of a Word in a File Using FileReader
Problem:
Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
Approach:
Create a FileReader to read from the file and wrap it in a BufferedReader.
Initialize a counter variable to keep track of word occurrences.
For each line in the file, split it into words and check if the target word exists.
Increment the counter each time the word is found.
Print the final count.
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OccurenceOfAWord {
    public static void main(String[] args) {
        try{
            String path = "D:\\Week03\\Day_04\\fileReader\\OccurenceOfAWord.txt";
            FileReader fr=new FileReader(path);
            BufferedReader br=new BufferedReader(fr);
            String s;

            System.out.println("Target is :-  StringBuffer \n");
           System.out.println("Given text in the file is :- \n");
            int count=0;
            while((s=br.readLine()) !=null){
                System.out.println(s);
             String arr[]=s.split(" ");
              for(String it:arr){
                if(it.equals("StringBuffer")) count++;
              }

            }
            br.close();
            System.out.println();
            System.out.println("Target comes "+count+" times");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
    }
    
}