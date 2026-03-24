package collectionJava;
import java.util.Scanner;

public class SnakeGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        int x = width / 2;
        int y = height / 2;
        System.out.print("How many moves:");
        int moves = sc.nextInt();
        sc.nextLine();
        System.out.println("\nControls: W=Up S=Down A=Left D=Right\n");
        for (int i = 1; i <= moves; i++) {
            printBoard(width, height, x, y);
            System.out.print("Move " + i + ": ");
            char move = sc.nextLine().toUpperCase().charAt(0);
            switch (move) {
                case 'W': y--; 
                break; 
                case 'S': y++; 
                break; 
                case 'A': x--;
                break; 
                case 'D': x++; 
                break; 
                default:
                    System.out.println("Invalid");
                    i--; 
                    continue;
            }
            if (x < 0 || x >= width || y < 0 || y >= height) {
                System.out.println("Hit!Game Over");
                break;
            }
        }
        sc.close();
    }
    static void printBoard(int width, int height, int sX, int sY) {
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                if (r == sY && c == sX)
                    System.out.print("S ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

