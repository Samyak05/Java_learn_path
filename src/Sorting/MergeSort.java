package Sorting;

import java.util.Arrays;

public class MergeSort {
    static void main() {
        int[] nums = {3,5,7,2,8,9};
        MS(nums, 0, nums.length-1);
        System.out.print(Arrays.toString(nums));
    }

    public static void MS(int[] nums, int start, int end){
        if(start < end){
            int mid = start + (end-start)/2;

            MS(nums, start, mid);
            MS(nums, mid+1, end);

            Merge(nums, start, mid, end);
        }
    }

    public static void Merge(int[] nums, int start, int mid, int end){
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0; //INDEX POINTER OF TEMP ARRAY

        while(i <= mid && j <= end){
            if(nums[i] <= nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = nums[i];
            k++;
            i++;
        }
        while(j <= end){
            temp[k] = nums[j];
            k++;
            j++;
        }

        //COPY BACK LIST ELEMENTS INTO ORIGINAL ARRAY
        for(int idx=0; idx<temp.length; idx++){
            nums[start + idx] = temp[idx];
        }
    }
}
