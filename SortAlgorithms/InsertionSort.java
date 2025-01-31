/*
2. Insertion Sort - Sort Employee IDs
Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
*/

public class InsertionSort {

    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int temp=arr[i];
            
            while(j>=0  && arr[j] > temp ){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=temp;
        }


    }
    public static void main(String[] args) {
        int marks[]={98,75,67,101,91,99,80,54};
        System.out.println("Initial array is :");
        for(int it:marks){
        System.out.print(it+" ");
        }

        System.out.println();
        System.out.println();
        
        insertionSort(marks);
        System.out.println("After sorting array is: ");
        for(int it:marks){
        System.out.print(it+" ");
          }
    }
    
}