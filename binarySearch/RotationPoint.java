/*
Binary Search Problem 1: Find the Rotation Point in a Rotated Sorted Array
Problem:
You are given a rotated sorted array. Write a program that performs Binary Search to find the index of the smallest element in the array (the rotation point).
Approach:
Initialize left as 0 and right as n - 1.
Perform a binary search:
Find the middle element mid = (left + right) / 2.
If arr[mid] > arr[right], then the smallest element is in the right half, so update left = mid + 1.
If arr[mid] < arr[right], the smallest element is in the left half, so update right = mid.
Continue until left equals right, and then return arr[left] (the rotation point).
*/

import java.util.*;

public class RotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] > arr[right]) 
                left = mid + 1;
            else 
                right = mid;
        }
        
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6,8,6,5,3}; 
        int index = findRotationPoint(arr);
        System.out.println("Rotation point index: " + index);
    }
}