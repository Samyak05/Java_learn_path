package arrays;

import java.util.ArrayList;

public class Find {
    static void main() {
        int[] arr = {3, 6, 7, 7, 2, 9};

        System.out.println(isExist(arr, 0, 7));
        System.out.println(ExistedIdx(arr, 0, 7));

        findAllIdx(arr, 0, 7);
        System.out.println(list);

    }

    static boolean isExist(int[] arr, int index, int target){
        // base
        if(index == arr.length) return false;

        return arr[index] == target || isExist(arr, index+1, target);
    }

    static int ExistedIdx(int[] arr,int index, int target){
        //base
        if(index == arr.length) return -1;
        if(arr[index] == target){
            return index;
        }else{
            return ExistedIdx(arr, index+1, target);
        }
    }


    // Finding all index
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIdx(int[] arr, int index, int target){
        //base
        if(index == arr.length) return;

        // add all index
        if(arr[index] == target){
            list.add(index);
        }
        findAllIdx(arr, index+1, target);
    }
}
