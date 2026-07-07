import java.util.*;

public class Stringtutorial {
    public static void main(String[] args) {
        String name = "    Sa         myak    ";

        name = name.trim().replaceAll("\\s+", " ");
        char[] arr = name.toCharArray();
        String[] words = name.split(" ");

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(arr));


        // System.out.println(name);
        // System.out.println(Arrays.toString(name.split("\\s+")));
        // System.out.println(Arrays.toString(words));
        // System.out.println(words);
        // System.out.println(String.join(" ", words));



        
        // StringBuilder SB = new StringBuilder();

        // SB.append('a');
        // SB.append('b');
        // SB.append('c');
        // SB.append(' ');

        // SB.append('e');
        // System.out.println(SB);
        // System.out.println(SB.toString());
        // System.out.println(SB.reverse());
    }
}
