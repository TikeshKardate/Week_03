/*
5. Selection Sort - Sort Exam Scores
Problem Statement:
A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
Hint:
Find the minimum element in the array.
Swap it with the first unsorted element.
Repeat the process for the remaining elements.
*/

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(arr[i]>arr[j]){
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[i]^arr[j];
                arr[i]=arr[i]^arr[j];
              }
            }
        }


    }
    public static void main(String[] args) {
        int marks[]={98,75,67,101,91,99,80,54};
        System.out.println("Intial array is :");
        for(int it:marks){
          System.out.print(it+" ");
        }
        System.out.println();
        System.out.println();

        selectionSort(marks);
        System.out.println("After sorting array is: ");
        for(int it:marks){
            System.out.print(it+" ");
          }
    }
}