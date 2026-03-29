import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int prev = 0;
        int curr = 1;
        if (n == 0 || n == 1) {
            System.out.println("Fibonacci: " + n);

        } else {
            for (int i = 2; i <= n; i++) {
                int temp = curr;
                curr = curr + prev;
                prev = temp;
            }
            System.out.println("Fibonacci: " + curr);
        }
        input.close();
    }
}