package arrays;

import java.util.ArrayList;

public class ArrayListRecursion {
    static void main() {
        int[] arr = {1, 3, 6, 7, 2, 9, 3};
        System.out.println(findAll(arr, 3, 0, new ArrayList<>()));

    }

    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list){
        //base
        if(index == arr.length) return list;

        if(arr[index] == target){
            list.add(index);
        }

        return findAll(arr, target, index+1, list);
    }
}
