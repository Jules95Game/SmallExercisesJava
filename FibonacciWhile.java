import helpers.parser.StringToInteger;

public class FibonacciWhile {
  public static void main(String[] args) {
    System.out.print("Up to which number do you want to generate Fibonacci numbers? ");
    int userChoice = StringToInteger.parseNatural();

    int secondLast = 1;
    int last = 1;
    int fib = secondLast + last;
    System.out.print(secondLast + ", " + last);

    while (fib <= userChoice) {
      System.out.print(", " + fib);
      secondLast = last;
      last = fib;
      fib = secondLast + last;
      if (fib < 1) break;
    }
  }
}
