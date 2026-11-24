public class ConnectFour {
   void main() {
        boolean game = true;
        String[][] board = {
                {"1", "2", "3", "4", "5", "6", "7"},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", "."},
        };
        String player = "1 ";
        String sign = "X";
        String ans = "";
        String boardS = "";
        int ansN = -1;
        int sum = 0;
        boolean invalid = true;
        boolean notFound = true;
        boolean room = true;

        IO.println("Welcome to Connect Four!");
        do {
            boardS = "";
            for (int i = 0; i < 7; i += 1) {
                for (int j = 0; j < 7; j += 1) {
                    if (i != 6 && j != 6) {
                        boardS += board[i][j] + " ";
                    } else if (i != 6 && j == 6) {
                        boardS += board[i][j] + "\n";
                    } else if (i == 6 && j != 6) {
                        boardS += board[i][j] + " ";
                    } else if (i == 6 && j == 6) {
                        boardS += board[i][j];
                    }
                }
            }
            IO.println(boardS);
            sum = 0;
            for (int i = 0; i < 7; i += 1) {
                if (!board[1][i].equals(".")) {
                    sum += 1;
                }
                if (sum == 7) {
                    IO.println("Game Ends in a Draw!");
                    return;
                }
            }

        } while (game);
    }
}

