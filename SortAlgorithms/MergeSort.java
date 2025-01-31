/*
3. Merge Sort - Sort an Array of Book Prices
Problem Statement:
A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
Hint:
Divide the array into two halves recursively.
Sort both halves individually.
Merge the sorted halves by comparing elements.
*/

public class MergeSort {

    public static void merge(int arr[],int start,int mid,int end){
        int leftSize=mid-start+1;
        int rightSize=end-mid;
        int left[]=new int[leftSize];
        int right[]=new int[rightSize];
        int j=start;

        for(int i=0;i<leftSize;i++){
            left[i]=arr[start+i];
        }  
        for(int i=0;i<rightSize;i++){
         right[i]=arr[mid+1+i];
        }
        int s=0,e=0; j=start;
        while(s<leftSize  && e<rightSize){
         if(left[s] < right[e]){
            arr[j++]=left[s];
            s++;

         }
         else {
            arr[j++]=right[e];
            e++;
         }
        }

        while(s<leftSize){
            arr[j++]=left[s++];
        }
        while(e<rightSize){
            arr[j++]=right[e++];
        }
    }

    public static void  mergeSort(int arr[],int start,int end){
        if(start>=end) return;
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);


    }
    public static void main(String[] args) {
        int marks[]={98,75,67,101,91,99,80,54};
        int n=marks.length;
        System.out.println("Initial array is :");
        for(int it:marks){
          System.out.print(it+" ");
        }
        System.out.println();
        System.out.println();
        
        mergeSort(marks,0,n-1);
        System.out.println("After sorting array is: ");
        for(int it:marks){
            System.out.print(it+" ");
          }
    }
}