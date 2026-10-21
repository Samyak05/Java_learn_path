package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main() {
        int[] nums = {3,5,7,2,8,9};
        Quick(nums, 0, nums.length-1);
        System.out.print(Arrays.toString(nums));
    }

    public static void Quick(int[] nums, int start, int end){
        if(start < end){
            int pivotIdx = Partition(nums, start, end);

            Quick(nums, start, pivotIdx-1);
            Quick(nums, pivotIdx+1, end);
        }
    }

    public static int Partition(int[] nums, int start, int end){
        int idx = start-1;

        //Choose a random pivot instead of nums[end]
        int randomIdx = start + (int)(Math.random() * (end - start + 1));

        int temp = nums[randomIdx];
        nums[randomIdx] = nums[end];
        nums[end] = temp;

        int pivot = nums[end];


        for(int j=start; j<end; j++){
            if(nums[j] <= pivot){
                idx++;
                swap(nums, idx, j);
            }
        }
        idx++;
        swap(nums, idx, end);

        return idx;

    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}