package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void main() {
        int[] arr = {5,3,6,2,9,7};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            int smallestIdx = i;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[smallestIdx]){
                    smallestIdx = j;
                }
            }
            swap(arr, i, smallestIdx);
        }
    }
}
