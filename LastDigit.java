import java.util.Scanner;

public class LastDigit {
  public static void main(String[] args) {
    System.out.println(lastDigit(7, 17));
    System.out.println(lastDigit(6, 17));
    System.out.println(lastDigit(3, 113));
    System.out.println("\nEnter the two numbers you want to compare.");
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("First number: ");
    int userNumber1 = inputScanner.nextInt();
    System.out.print("Second number: ");
    int userNumber2 = inputScanner.nextInt();
    System.out.println(lastDigit(userNumber1, userNumber2));
  }


  private static boolean lastDigit(int firstNum, int secondNum) {
    return firstNum % 10 == secondNum % 10;
  }
}
