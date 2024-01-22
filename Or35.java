import java.util.Scanner;

public class Or35 {
  public static void main(String[] args) {
    System.out.println(or35(3));
    System.out.println(or35(10));
    System.out.println(or35(8));
    System.out.print("\nEnter the number you want to evaluate: ");
    Scanner inputScanner = new Scanner(System.in);
    int userNumber = inputScanner.nextInt();
    System.out.println(or35(userNumber));
  }

  private static boolean or35(int number) {
    return number % 3 == 0 || number % 5 == 0;
  }
}
