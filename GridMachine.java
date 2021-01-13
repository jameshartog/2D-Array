/**
 * Description.
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;

public class GridMachine
{
    //Variables
    public static Scanner userScan = new Scanner(System.in);
    public static String[][] board = new String [5][5]; 
    public static boolean repeat = true;
    static void clear() {
        System.out.print('\u000C');
    }
    
    static String[][] createBoard() {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                board[r][c] = "Empty";
                System.out.print("[" + board[r][c] + "]");
            }
            System.out.println();
        }
        
        return board;
    }
   
    static void printBoard() {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("[" + board[r][c] + "]");
            }
            System.out.println();
        }
        
    }
    
    static void replacer() {
        System.out.println("Would you like to change a cell? (yes/no)");
        String cond = userScan.next();
        
        while (cond.equals("yes")) {
            System.out.print("What is the x-coordinate: ");
            int x = userScan.nextInt();
            System.out.print("What is the y-coordinate: ");
            int y = userScan.nextInt();
            
            System.out.print("What would you like to input? (5 characters long)");
            board[y-1][x-1] = userScan.next();
            clear();
            printBoard();
            
            System.out.println("Would you like to replace another cell? (yes/no)");
            cond = userScan.next();
        }
    }
    
    public static void main(String[] args) {
        createBoard();
        do {            
            replacer();
            //repeater
            System.out.print("Would you like to start again? (true/false)");
            repeat = userScan.nextBoolean();
        } while (repeat);
    }
}