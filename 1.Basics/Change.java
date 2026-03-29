import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        swap(a,b);
        System.out.println("a:"+ a + " " + "b:" + b);
        in.close();
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    
}
