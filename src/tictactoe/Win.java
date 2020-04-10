package tictactoe;

public class Win {
        static int gameOver = 0;

        public static void win(char[][] arr) {
                int xWins = 0;
                int oWins = 0;
                int totalXO = 0;

                for (int i = 0; i < 3; i++) {
                        if (arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2]) {
                                if (arr[i][0] == 'X') {
                                        xWins++;
                                } else if (arr[i][0] == 'O') {
                                        oWins++;
                                }

                        }
                        if (arr[0][i] == arr[1][i] && arr[0][i] == arr[2][i]) {
                                if (arr[0][i] == 'X') {
                                        xWins++;
                                } else if (arr[0][i] == 'O') {
                                        oWins++;
                                }
                        }
                }
                if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2] ||
                        arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
                        if (arr[1][1] == 'X') {
                                xWins++;
                        } else if (arr[1][1] == 'O') {
                                oWins++;
                        }
                }
                totalXO = Coordinates.noOfO + Coordinates.noOfX;
                if (xWins == 0 && oWins == 0 && totalXO == 9) {
                        System.out.println("Draw");
                        gameOver = 1;
                } else if (xWins == 1) {
                        System.out.println("X wins");
                        gameOver = 1;
                } else if (oWins == 1) {
                        System.out.println("O wins");
                        gameOver = 1;
                }

        }
}
