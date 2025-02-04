/*
StringBuilder Problem 2: Remove Duplicates from a String Using StringBuilder
Problem:
Write a program that uses StringBuilder to remove all duplicate characters from a given string while maintaining the original order.
Approach:
Initialize an empty StringBuilder and a HashSet to keep track of characters.
Iterate over each character in the string:
If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
Return the StringBuilder as a string without duplicates.
*/


import java.util.*;

// public class is defined
public class StringBuilderRemoveDuplicates{

    //Main method is the starting of the program
    public static void main (String[] args){

        //Scanner object is created to take the user input
        Scanner sc = new Scanner (System.in);

        //Prompts the user to take the input
        System.out.print("Enter the string : ");

        //Taking the user input
        String s = sc.nextLine();
        sc.close();

        // Calling the method
        String result = removeDuplicates(s);

        // Printing the result
        System.out.println("String without duplicates : "+result);

    }
        // Method removeDuplicates is created
        public static String removeDuplicates(String s){

            // Creating new StringBuilder object
            StringBuilder str =new StringBuilder();

            // Creating HashSet object
            HashSet<Character> original= new HashSet<>();

            // Converts the string to LowerCase
            s=s.toLowerCase();

            System.out.println("String in LowerCase : "+s);

            // For loop to check the characters in String s
            for (int i=0;i<s.length();i++){
            char c = s.charAt(i);

            // Checks if the original object does not contain Character at c
            if (!original.contains(c)){
                // Used for StringBuilder to add
                str.append(c);
                // Used for HashSet to add
                original.add(c);
            }
        }
            
            return str.toString();


        }
    }

