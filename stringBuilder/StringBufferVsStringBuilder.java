/*
StringBuffer Problem 2: Compare StringBuffer with StringBuilder for String Concatenation
Problem:
Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.
Approach:
Initialize two StringBuffer and StringBuilder objects.
Perform string concatenation in both objects, appending 1 million strings (e.g., "hello").
Measure the time taken to complete the concatenation using System.nanoTime() for both StringBuffer and StringBuilder.
Output the time taken by both classes for comparison.
*/

import java.util.*;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = 1000000;

        System.out.print("Enter the String : ");
        String s = sc.next();

        // Measure time for StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(s);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Measure time for StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
        }
        
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Output the time taken by both classes
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        sc.close();
    }
}
