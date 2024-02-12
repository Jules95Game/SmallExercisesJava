import helpers.parser.StringToInteger;

public class FibonacciWhile {
  public static void main(String[] args) {
    System.out.print("Up to which number do you want to generate Fibonacci numbers? ");
    int userChoice = StringToInteger.parseNatural();

    if (userChoice == 1) {
      System.out.println("1, 1");
      return;
    } else if (userChoice == 2) {
      System.out.println("1, 1, 2");
      return;
    }

    int secondLast = 1;
    int last = 1;
    int fib = secondLast + last;
    System.out.print(secondLast + ", " + last);
    do {
      System.out.print(", " + fib);
      secondLast = last;
      last = fib;
      fib = secondLast + last;
      if (fib < 1) break;
    } while (fib <= userChoice);
  }
}
