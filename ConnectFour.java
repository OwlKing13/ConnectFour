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
        String boardS = "";
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
        } while (game);
    }
}
