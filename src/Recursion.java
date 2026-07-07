public class Recursion {
    public static void rec (int n){
        if(n>5){
            return;
        }
        System.out.print(n + " ");
        rec(n+1);
    }

    public static void main(String[] args) {

        rec(1);
        
    }
}