import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class ArrListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();


        int[] nums = {2,3,4};

        arr.add(Arrays.asList(nums[0], nums[1], nums[2]));
        arr.add(Arrays.asList(nums[0], nums[1], nums[2]));

        
        System.out.println(arr);
        in.close();
        
    }
}