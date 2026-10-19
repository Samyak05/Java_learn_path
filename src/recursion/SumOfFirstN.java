package recursion;

public class SumOfFirstN {
    public static void sumN(int n, int sum){
        if(n < 1){
            System.out.print(sum);
            return;
        }
        sumN(n-1, sum+n);
    }

    static void main() {
        sumN(3, 0);
    }
}
