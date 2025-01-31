/*
4. Quick Sort - Sort Product Prices
Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
Recursively apply Quick Sort on left and right partitions.
*/

public class QuickSort {

// let pivot is first element
// count the no of elements between st to end, smaller than pivot element
// count of smaller element + st is suitable place for the pivot
// swap st +count position with the st position because  our pivot is st'th element 
// now we have to place smaller elements then the pivot to the left and greater elemts to the right and then return the
// pivot index that means pivot element is in its right position  

    public static int partion(int arr[],int st,int end){
        int pivot=arr[st]; int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot) count++;
        }

        int pivotIndex=st+count;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[st];
        arr[st] = temp;

        
        int i=st,j=end;
          while(i<pivotIndex  && j>pivotIndex){
            while(arr[i]<=pivot) i++;
            while(arr[j] >pivot) j--;
            if(i<pivotIndex  && j>pivotIndex){
               arr[i]=arr[i]^arr[j];
               arr[j]=arr[i]^arr[j];
               arr[i]=arr[i]^arr[j];
                i++;j--;
            }

          }
          return pivotIndex;

    }

    public static void quickSort(int arr[],int st,int end){
        if(st>=end) return;
        int p=partion(arr,st,end);
        quickSort(arr, st, p-1);
        quickSort(arr, p+1, end);

    }
    public static void main(String[] args) {
        int marks[]={98,75,67,101,91,99,80,54};
        System.out.println("Initial array is :");
        for(int it:marks){
          System.out.print(it+" ");
        }

        System.out.println();
        System.out.println();

        int n=marks.length;
        quickSort(marks,0,n-1);
        System.out.println("After sorting array is: ");
        for(int it:marks){
            System.out.print(it+" ");
          }
    }
}