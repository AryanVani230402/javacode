import java.util.Arrays;

public class n_queen {

    public static void Nqueen(int i,int n, char[][] board) {
        if (i == n) {
            for (char [] m:board)
            {
                for (char ch:m)
                {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
            System.out.println();

            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(i, j, board)) {
                    board[i][j] = 'Q';
                    Nqueen(i + 1,n, board);
                    board[i][j] = '.';
            }
        }
    }

    private static boolean isSafe(int i, int j, char[][] board) {
        int row = i;
        int col = j;

//        check upper_left
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

//        check lower_right
        row = i;
        col = j;
        while (row < board.length && col < board.length) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col++;
        }
//        check upper_right
        row = i;
        col = j;
        while (row >= 0 && col < board.length) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col++;
        }
//        check lower_left
        row = i;
        col = j;
        while (row < board.length && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }
//        check row
        row=0;
        col=j;
        while (row< board.length)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            row++;
        }

//        check column
        row=i;
        col=0;
        while (col< board.length)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            col++;
        }
        return true;
    }

    public static void main(String[] args) {
        char [][] board =new char[8][8];
        for (char [] row: board)
        {
            Arrays.fill(row,'.');
        }
        Nqueen(0,8,board);
    }
}
