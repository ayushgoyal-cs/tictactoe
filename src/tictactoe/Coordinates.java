package tictactoe;

import java.util.Scanner;

public class Coordinates {

    void inputCoordinates(char[][] arr) {
        Scanner sc = new Scanner(System.in);
        int noOfO = 0;
        int noOfX = 0;
        boolean inputIsCorrect = false;
        while (!inputIsCorrect) {
            System.out.println("Enter the coordinates: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x < 1 || x > 3 || y < 1 || y > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }
    }
}
