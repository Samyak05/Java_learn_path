package backtracking;

public class Maze {

    static void main() {
        System.out.println(countMaze(5,5));
    }

    static int countMaze(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = countMaze(row-1, col);
        int right = countMaze(row, col-1);

        return left+right;
    }
}