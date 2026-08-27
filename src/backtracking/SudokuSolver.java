package backtracking;

public class SudokuSolver {
    static void main() {
        int[][] sudoku = {
                {0, 0, 0, 0, 1, 5, 3, 7, 0},
                {0, 5, 8, 7, 0, 3, 4, 0, 0},
                {3, 4, 7, 0, 2, 8, 0, 0, 0},
                {5, 1, 0, 6, 7, 0, 0, 0, 4},
                {6, 0, 0, 8, 0, 0, 0, 5, 7},
                {8, 0, 0, 0, 0, 9, 0, 1, 0},
                {4, 6, 9, 0, 0, 0, 0, 0, 2},
                {0, 8, 1, 3, 0, 0, 0, 0, 0},
                {7, 3, 0, 2, 0, 0, 1, 9, 0}
        };

        if(solve(sudoku)){
            // this means you found one of the answers
            display(sudoku);
        }else {
            System.out.println("Cannot solve this Sudoku");
        }
    }

    static void display(int[][] board){
        for(int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;


        // find that particular rol, col of empty cell
        boolean FoundEmptyCell = false;
        for(int i=0; i< n; i++){
            //check if any cell in the column is empty
            for(int j=0; j<n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    FoundEmptyCell = true;
                    break;
                }
            }
            // if empty cell is found in previous row, then break
            if(FoundEmptyCell){
                break;
            }
        }

        if(FoundEmptyCell == false){
            // found one of the possible answers
            // Sudoku is solved
            return true;
        }

        //now if any cell was empty we would have found it, denoted by board[row][col]
        // so check all numbers from 1-9 if they are safe to place in that cell
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                //recursive call
                if(solve(board)){
                    // found one of the possible answers
                    // Sudoku is solved
                    return true;
                }else{
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        // check the row
        for(int i=0; i< board.length; i++){
            // if the number is present anywhere in the current row, we cannot place num in tha current cell
            if(board[row][i] == num){
                return false;
            }
        }

        // check the column
        for(int[] nums : board){
            // if the number is present anywhere in the current col, we cannot place num in tha current cell
            if(nums[col] == num){
                return false;
            }
        }

        //check each small square matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int boxRowStart = row - (row%sqrt);
        int boxColStart = col - (col%sqrt);

        for (int r = boxRowStart; r < boxRowStart+sqrt; r++){
            for(int c = boxColStart; c < boxColStart+sqrt; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }


}
