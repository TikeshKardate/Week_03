/*
StringBuffer Problem 1: Concatenate Strings Efficiently Using StringBuffer
Problem:
You are given an array of strings. Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
Approach:
Create a new StringBuffer object.
Iterate through each string in the array and append it to the StringBuffer.
Return the concatenated string after the loop finishes.
Using StringBuffer ensures efficient string concatenation due to its mutable nature.
*/


import java.util.*;

public class StringBufferConcatenate {

    //Main method is the starting of the program
    public static void main (String[]args){

        //Scanner object is created to take the user input
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the string array : ");
        int n = sc.nextInt();


        //Prompts the user to take the input
        System.out.print("Enter the string to be stored in the array: ");

        //Taking the user input
        String[] s =new String[n];
        for (int i=0;i<n;i++){
        s[i]= sc.next();
        }
        sc.close();

        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer();
        
        for (int i=0;i<s.length;i++){
            sb.append(s[i]);
        }

            System.out.println("Concatenated String is : "+String.valueOf(sb));
               
             //or we can use
         // System.out.println("Concatenated String is : "+sb.toString());

    }
}
