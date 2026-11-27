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
	    while (invalid == true) {
                ans  = IO.readln("Player " + player + "(" + sign + ") - Choose a column:\n");
                if (ans != null && !ans.isEmpty() && !ans.equals("")
                        && (ans.equals("1") || ans.equals("2") || ans.equals("3")
                        || ans.equals("4") || ans.equals("5") || ans.equals("6") || ans.equals("7"))) {
                    ansN = Integer.parseInt(ans) - 1;
                    room = (board[1][ansN]).equals(".");
                }

                if (ans == null || ans.isEmpty() || ans.equals("") || !room) {
                    IO.println("Invalid Column");
                    invalid = true;
                } else if (ansN >= 0 && ansN <= 6 && room) {
                    invalid = false;
                } else {
                    IO.println("Invalid Column");
                    invalid = true;
                }
            }
            for (int i = 0; i < 7; i += 1) {
                if (notFound && (board[6 - i][ansN]).equals(".")) {
                    board[6 - i][ansN] = sign;
                    notFound = false;
                }
            }
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
	    for (int i = 1; i < 4; i += 1) {
                for (int j = 0; j < 7; j += 1) {
                    if ((board[i][j]).equals(board[i + 1][j])
                            && (board[i + 1][j]).equals(board[i + 2][j])
                            && (board[i + 2][j]).equals(board[i + 3][j]) && !(board[i][j]).equals(".")) {
                        IO.println(boardS);
                        IO.println("Player " + player + "Wins!");
                        return;
                    }
                }
            }
            for (int i = 1; i < 7; i += 1) {
                for (int j = 0; j < 4; j += 1) {
                    if ((board[i][j]).equals(board[i][j + 1])
                            && (board[i][j + 1]).equals(board[i][j + 2])
                            && (board[i][j + 2]).equals(board[i][j + 3])
                            && !(board[i][j]).equals(".")) {
                        IO.println(boardS);
                        IO.println("Player " + player + "Wins!");
                        return;
                    }
                }
            }
            for (int i = 1; i < 4; i += 1) {
                for (int j = 0; j < 4; j += 1) {
                    if ((board[i][j]).equals(board[i + 1][j + 1])
                            && (board[i + 1][j + 1]).equals(board[i + 2][j + 2])
                            && (board[i + 2][j + 2]).equals(board[i + 3][j + 3])
                            && !(board[i][j]).equals(".")) {
                        IO.println(boardS);
                        IO.println("Player " + player + "Wins!");
                        return;
                    }
                }
            }
            for (int i = 4; i < 7; i += 1) {
                for (int j = 0; j < 4; j += 1) {
                    if ((board[i][j]).equals(board[i - 1][j + 1])
                            && (board[i - 1][j + 1]).equals(board[i - 2][j + 2])
                            && (board[i - 2][j + 2]).equals(board[i - 3][j + 3])
                            && !(board[i][j]).equals(".")) {
                        IO.println(boardS);
                        IO.println("Player " + player + "Wins!");
                        return;
                    }
                }
            }	
	    if (player.equals("1 ")) {
                player = "2 ";
                sign = "O";
            } else if (player.equals("2 ")) {
                player = "1 ";
                sign = "X";
            }
            invalid = true;
            notFound = true;
            ans = "";
            ansN = -1;
            sum = 0;
            room = true;
        } while (game);
    }
}

