package Static;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am inside static block");
        b = a*4;
    }

    static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b +=3;

        System.out.println(StaticBlock.b);
    }
}
