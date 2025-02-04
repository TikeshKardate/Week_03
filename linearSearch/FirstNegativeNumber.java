/*
 * Linear Search Problem 1: Search for the First Negative Number
Problem:
You are given an integer array. Write a program that performs Linear Search to find the first negative number in the array. If a negative number is found, return its index. If no negative number is found, return -1.
Approach:
Iterate through the array from the start.
Check if the current element is negative.
If a negative number is found, return its index.
If the loop completes without finding a negative number, return -1.
 */

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,-8,-4,6};
        int n=arr.length;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]<0) break; 
        }
        if(i<n) System.out.println("First negative element is present at "+ i);
        else System.out.println("Negative element is not present ");
    }
    
}