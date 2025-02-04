/*
StringBuilder Problem 1: Reverse a String Using StringBuilder
Problem:
Write a program that uses StringBuilder to reverse a given string. For example, if the input is "hello", the output should be "olleh".
Approach:
Create a new StringBuilder object.
Append the string to the StringBuilder.
Use the reverse() method of StringBuilder to reverse the string.
Convert the StringBuilder back to a string and return it.
*/


import java.util.*;

// public class is defined
public class StringBuilderReverse{

    //Main method is the starting of the program
    public static void main (String[] args){

        //Scanner object is createed to take the user input
        Scanner sc = new Scanner (System.in);

        //Prompts the user to take the input
        System.out.print("Enter the string : ");

        //Taking the user input
        String s = sc.nextLine();

        // Creating a stringbuilder object
        StringBuilder str = new StringBuilder(s);

        // reverse built-in method to reverse a string
        str.reverse();


        String rev=new String (str.toString());

        // Ptrinting the reversed string 
        System.out.print("The reversed string is : " +rev);
        sc.close();

}}