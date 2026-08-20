package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] arr = {3,5,7,2,8,9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev] > temp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
    }
}
