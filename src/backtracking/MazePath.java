package backtracking;
import java.util.ArrayList;
import java.util.List;


public class MazePath {
    public static void main() {
        Path("", 3,3);
        System.out.println(PathArray("",3,3));
    }

    static void Path(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(col > 1){
            Path(p+'R',row, col-1);
        }
        if(row > 1){
            Path(p+'D',row-1, col);
        }
    }

    static List<String> PathArray(String p, int row, int col){
        if(row == 1 && col == 1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> res = new ArrayList<>();

        if(col > 1){
           res.addAll(PathArray(p+'R', row, col-1));
        }
        if (row > 1){
            res.addAll(PathArray(p+'D', row-1, col));
        }
        return res;
    }
}
