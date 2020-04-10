package tictactoe;

import java.util.Scanner;

public class Coordinates {
    static int noOfO = 0;
    static int noOfX = 0;

    public static void inputCoordinates(char[][] arr) {
        Scanner sc = new Scanner(System.in);

        boolean inputIsCorrect = false;
        while (!inputIsCorrect) {
            System.out.println("Enter the coordinates: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x < 1 || x > 3 || y < 1 || y > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (arr[3 - y][x - 1] == ' ' && noOfO == noOfX) {
                arr[3 - y][x - 1] = 'X';
                noOfX++;
                inputIsCorrect = true;
            } else if (arr[3 - y][x - 1] == ' ' && noOfX > noOfO) {
                arr[3 - y][x - 1] = 'O';
                noOfO++;
                inputIsCorrect = true;
            } else {
                System.out.println("This cell is occupied! Choose another one!");
            }
        }
    }
}
