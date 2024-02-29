import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
  private static Scanner input = new Scanner(System.in);
  private static String solution;
  private static ArrayList<Character> foundChars = new ArrayList<Character>();

  public static void main(String[] args) {
    startGame();

    int turn = 1;
    boolean gameRunning = true;
    while (gameRunning) {
      System.out.println("Current turn: " + turn);

      printFoundChars();
      System.out.println();

      char guess = getUserGuess();
      System.out.println();

      checkUserGuess(guess);
      System.out.println();
      System.out.println();

      gameRunning = determineWin(turn);

      turn++;
    }
  }


  private static void startGame() {
    System.out.print("Please enter a word: ");
    solution = input.nextLine();

    for (int i = 0; i < solution.length(); i++) {
      foundChars.add('_');
    }
    System.out.println();
  }


  private static void printFoundChars() {
    for (char found : foundChars) {
      System.out.print(found);
    }
    System.out.println();
  }


  private static char getUserGuess() {
    String rawGuess = "";
    System.out.print("Try to guess a letter: ");
    while (true) {
      rawGuess = input.nextLine();
      if (rawGuess.length() == 1) {
        break;
      } else {
        System.out.print("\nPlease only enter one letter: ");
      }
    }
    return rawGuess.toLowerCase().charAt(0);
  }


  private static void checkUserGuess(char guess) {
    if (foundChars.indexOf(guess) != -1) {
      System.out.println("You already guessed this letter!");
      return;
    }

    ArrayList<Integer> indices = new ArrayList<Integer>();
    int index = solution.toLowerCase().indexOf(guess);
    do {
      indices.add(index);
      index = solution.toLowerCase().indexOf(guess, index + 1);
    } while (index >= 0);

    if (indices.get(0) == -1) {
      System.out.println("Bad guess!");
    } else {
      System.out.println("Good guess!");
      for (int change : indices) {
        foundChars.set(change, solution.charAt(change));
      }
    }
  }


  private static boolean determineWin(int turn) {
    if (foundChars.indexOf('_') == -1) {
      System.out.println("You won! The word was " + solution);
      return false;
    }
    if (turn == 10) {
      System.out.println("You lost. The word was " + solution);
      return false;
    }
    return true;
  }
}
