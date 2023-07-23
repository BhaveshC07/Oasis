package Oasis;
import java.util.*;
public class NumberGuessingGame {
    static ArrayList<Integer> scoreBoard = new ArrayList<Integer>();
    public static void main(String[] args) {
        NumberGuessingGame methodChange = new NumberGuessingGame();
        methodChange.menu(scoreBoard);
    }
    public void menu(ArrayList<Integer> scoreBoard) {
        NumberGuessingGame methodChange = new NumberGuessingGame();
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Welcome to the number game");
        System.out.println("1) Play the Game");
        System.out.println("2) Exit the game");
        System.out.println("--------------------");
            System.out.print("What action would you like to do from the above actions? ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\n" + "What would you like the range of the numbers to be? ");
                    int n = (int) (100 * Math.random());
                    methodChange.guessNumber(n);
                    break;
                case 2:
                    System.out.println("\n" + "Thanks for playing the game!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter Valid input ");
                    menu(scoreBoard);
            }
        }
    public void guessNumber(int randomNumber) {
        Scanner input = new Scanner(System.in);
        int userGuess;
        int guess = 0;
        do {
            System.out.print("Enter your guess number: ");
            userGuess = input.nextInt();
            guess++;
            if (userGuess > randomNumber) {
                System.out.println("Lower");
            } else if (userGuess < randomNumber) {
                System.out.println("Higher");
            }
        } while (randomNumber != userGuess);
        System.out.println(" ");
            System.out.println("You answered number is right in " + guess + " tries!");
        menu(scoreBoard);
    }
}