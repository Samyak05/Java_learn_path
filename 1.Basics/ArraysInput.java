import java.util.Arrays;
import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] st = new String[5];

        for(int i=0; i < st.length; i++){
            st[i] = input.next();
        }

        for (String string : st) {
            System.out.print(string + " ");
        }

        System.out.println(Arrays.toString(st));
        input.close();
    }
}
