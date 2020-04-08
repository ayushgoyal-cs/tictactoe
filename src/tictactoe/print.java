package tictactoe;

public class print {
        void print(char[][] arr){
                System.out.println("---------");
                for (char[] x : arr) {
                        System.out.print("| ");
                        for (char y : x) {
                                System.out.print(y + " ");
                        }
                        System.out.println("|");
                }
                System.out.println("---------");
        }
}
