package tictactoe;

public class Win {
        void win(char[][] arr) {
                int xWins = 0;
                int oWins = 0;
                for (int i = 0; i < 3; i++) {
                        if (arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2]) {
                                if (arr[i][0] == 'X') {
                                        xWins++;
                                } else if (arr[i][0] == 'O') {
                                        oWins++;
                                }
                        }
                }
        }
}
