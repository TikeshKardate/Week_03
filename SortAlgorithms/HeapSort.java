/*
6. Heap Sort - Sort Job Applicants by Salary
Problem Statement:
A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Reheapify the remaining elements and repeat until sorted.
*/

public class HeapSort {
    public static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    
    private static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
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
        
        heapSort(marks);
        System.out.println("After sorting array is: ");
        for(int it:marks){
            System.out.print(it+" ");
          }
    }
}