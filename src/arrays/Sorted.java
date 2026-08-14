package arrays;

public class Sorted {
    static void main() {
        int[] arr = {1,2,3,4,3,5};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index){
        //base condition
        if(index == arr.length-1) return true;

        //recursion
        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }
}
