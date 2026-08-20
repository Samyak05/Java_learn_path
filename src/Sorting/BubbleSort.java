package Sorting;

import java.util.Arrays;

public class BubbleSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }
    static void main() {
        int[] arr = {7, 3, 5, 9, 1, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
