import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class tic_tac_toe {
    static ArrayList<String> board = new ArrayList<String>();
    static String letter_x = "X";
    static String letter_o = "O";
    static Scanner sc = new Scanner(System.in);
    static int player_1;
    static int player_2;
    static boolean gameEnded = false;
    static int h = 0;
    static int moves = 0;
    public static void main(String[] args){
        int choice;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("           WELCOME TO THE XOXO WORLD");
            System.out.println("--------------------------------------------------");
            System.out.println();
            System.out.println("1. Start Game");
            System.out.println("2. Exit Game");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {

                    System.out.println("Starting game...");
                    board.clear();
                    for (int s = 0; s < 9; s++) {
                        board.add("-");

                    }
                    user_interface();
                    System.out.println();
                    wdl();
                }
                case 2 -> {
                    System.out.println("Exiting game...");
                    System.exit(0); // terminate the program
                }
                default -> System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (true);


    }

    private static void player_1(){
        while (true){
            System.out.print("Enter player 1's number: ");
            try {
                player_1 = Integer.parseInt(String.valueOf(sc.nextInt()-1));
                // The above line reads an integer input from the user and subtracts 1 from it.
                // The resulting value is then converted to a string and parsed as an integer.

                if(board.get(player_1).contains(letter_x) || board.get(player_1).contains(letter_o)){
                    System.out.println("Letter exists");
                    // If the board already contains an 'X' or 'O' at the specified position,
                    // the code prints an error message and prompts the user to enter a valid input.
                }
                else{
                    board.set(player_1, letter_x);
                    // If the input is valid and the position is available,
                    // the code sets the 'X' symbol at the specified position on the board.
                    user_interface();
                    System.out.println();
                    break;
                    // The code exits the while loop and the turn is over.
                }
            }
            catch (Exception e){
                System.out.println("Invalid input. Please enter a valid integer.");
                // If the input is not a valid integer, the code prints an error message and prompts the user to enter a valid input.
                sc.next(); // consume the non-integer input to avoid an infinite loop
            }

        }

    }

    private static void player_2(){
        while (true){
            System.out.print("Enter player 2's number: ");
            System.out.println();
            try{
                Random rand = new Random();
                player_2 = rand.nextInt(9);
                System.out.print(player_2);
                System.out.println();
                if(board.get(player_2).contains(letter_x) || board.get(player_2).contains(letter_o)){
                    System.out.println("Letter exists");
                }
                else{
                    board.set(player_2, letter_o);
                    user_interface();

                    System.out.println();
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Invalid input. Please enter a valid integer.");
                // If the input is not a valid integer, the code prints an error message and prompts the user to enter a valid input.
                sc.next(); // consume the non-integer input to avoid an infinite loop
            }
        }
    }
    private static void wdl(){
        while (h <= 4){
            player_1();
            moves++;
            if(board.get(0).contains(letter_x) && board.get(1).contains(letter_x) && board.get(2).contains(letter_x)){
                System.out.println("You Won");
                gameEnded = true;
                break;
            }if (board.get(3).contains(letter_x) && board.get(4).contains(letter_x) && board.get(5).contains(letter_x)) {
                System.out.println("You Won");
                gameEnded = true;
                break;
            }
            else if (board.get(6).contains(letter_x) && board.get(7).contains(letter_x) && board.get(8).contains(letter_x)) {
                System.out.println("You Won");
                gameEnded = true;
                break;
            }
            else if (board.get(0).contains(letter_x) && board.get(3).contains(letter_x) && board.get(6).contains(letter_x)) {
                System.out.println("You Won");
                gameEnded = true;
                break;
            }
            else if (board.get(1).contains(letter_x) && board.get(4).contains(letter_x) && board.get(7).contains(letter_x)) {
                System.out.println("You Won");
                gameEnded = true;
                break;
            }
            else if (board.get(2).contains(letter_x) && board.get(5).contains(letter_x) && board.get(8).contains(letter_x)) {
                System.out.println("You Won");
                gameEnded = true;
                break;
            }
            else if (board.get(0).contains(letter_x) && board.get(4).contains(letter_x) && board.get(8).contains(letter_x)) {
                System.out.println("You Won");
                gameEnded = true;
                break;
            }
            else if (board.get(2).contains(letter_x) && board.get(4).contains(letter_x) && board.get(6).contains(letter_x)) {
                System.out.println("You Won");
                gameEnded = true;
                break;
            }
            if (moves == 9) {
                System.out.println("Draw");
                gameEnded = true;
                break;
            }
            player_2();
            moves++;
            if (board.get(3).contains(letter_o) && board.get(4).contains(letter_o) && board.get(5).contains(letter_o)) {
                System.out.println("You Lost");
                gameEnded = true;
                break;
            }
            else if (board.get(6).contains(letter_o) && board.get(7).contains(letter_o) && board.get(8).contains(letter_o)) {
                System.out.println("You Lost");
                gameEnded = true;
                break;
            }
            else if (board.get(0).contains(letter_o) && board.get(3).contains(letter_o) && board.get(6).contains(letter_o)) {
                System.out.println("You Lost");
                gameEnded = true;
                break;
            }
            else if (board.get(1).contains(letter_o) && board.get(4).contains(letter_o) && board.get(7).contains(letter_o)) {
                System.out.println("You Lost");
                gameEnded = true;
                break;
            }
            else if (board.get(2).contains(letter_o) && board.get(5).contains(letter_o) && board.get(8).contains(letter_o)) {
                System.out.println("You Lost");
                gameEnded = true;
                break;
            }
            else if (board.get(0).contains(letter_o) && board.get(4).contains(letter_o) && board.get(8).contains(letter_o)) {
                System.out.println("You Lost");
                gameEnded = true;
                break;
            }
            else if (board.get(2).contains(letter_o) && board.get(4).contains(letter_o) && board.get(6).contains(letter_o)) {
                System.out.println("You Lost");
                gameEnded = true;
                break;
            }

            if (gameEnded) { // Check the flag after each player's turn
                break;
            }
            h++;
        }
    }
    private static void user_interface(){
        for(int i = 0; i<board.size(); i++){
            // The loop prints the current state of the board.
            if(i == 3 || i == 6){
                System.out.println();
                System.out.println("-------------------------------------");
                // The above lines print horizontal separators for every third row.
            }
            if(i==1 || i==2 || i==4 || i==5 || i==7 || i==8){
                System.out.print(" |  ");
                // The above line prints vertical separators for every column except the first.
            }
            System.out.print("\t"+board.get(i)+"    ");
            // The above line prints the symbol at the specified position on the board.
        }
    }
}

