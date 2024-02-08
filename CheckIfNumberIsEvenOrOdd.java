import java.util.Scanner;

public class CheckIfNumberIsEvenOrOdd {
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Input a number: ");

    int result = (inputScanner.nextInt() % 2 == 0) ? 1 : 0;
    System.out.print(result);
  }
}
