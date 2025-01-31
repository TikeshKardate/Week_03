/*
7. Counting Sort - Sort Student Ages
Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
*/

public class CountingSort {
    public static void countingSort(int arr[]) {
        int max = 18, min = 10;
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        
        for (int num : arr) {
            count[num - min]++;
        }
        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
    
    public static void main(String[] args) {
        int ages[] = {12, 15, 11, 18, 10, 17, 13, 16, 14, 12};
        System.out.println("Initial array is:");
        for (int it : ages) {
            System.out.print(it + " ");
        }
        System.out.println();
        System.out.println();

        countingSort(ages);
        System.out.println("After sorting array is:");
        for (int it : ages) {
            System.out.print(it + " ");
        }
    }
}