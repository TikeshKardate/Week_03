/*
Challenge Problem: Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
Problem:
Write a program that:
Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
Approach:
StringBuilder and StringBuffer:
Create a list of strings (e.g., "hello").
Concatenate the strings 1,000,000 times using both StringBuilder and StringBuffer.
Measure and compare the time taken for each.
FileReader and InputStreamReader:
Read a large text file (100MB) using FileReader and InputStreamReader.
Count the number of words by splitting the text on whitespace characters.
Print the word count and compare the time taken for reading the file.
*/


import java.io.*;

public class ChallengeProblem1 {
   
    static void compareStringBuilderAndBuffer() {
        int n = 1000000;
        String word = "Tikesh";

        long start1 = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(word);
        }
        long end1 = System.nanoTime();
        System.out.println("StringBuilder time: " + (end1 - start1) / 1e6 + " ms");

        long start2 = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append(word);
        }
        long end2 = System.nanoTime();
        System.out.println("StringBuffer time: " + (end2 - start2) / 1e6 + " ms");
    }

    static void compareFileReaders(String filePath) {
        long start1 = System.nanoTime();
        int words1 = countWordsUsingFileReader(filePath);
        long end1 = System.nanoTime();
        System.out.println("FileReader word count: " + words1 + ", Time: " + (end1 - start1) / 1e6 + " ms");

        long start2 = System.nanoTime();
        int words2 = countWordsUsingInputStreamReader(filePath);
        long end2 = System.nanoTime();
        System.out.println("InputStreamReader word count: " + words2 + ", Time: " + (end2 - start2) / 1e6 + " ms");
    }

    static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        

        try {
            FileReader fr=new FileReader(filePath);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return wordCount;
    }

    static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return wordCount;
    }


 public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        compareFileReaders("D:\\Week03\\Day_04\\challengeProblems\\ChallengeProblem1.txt");
    }

}