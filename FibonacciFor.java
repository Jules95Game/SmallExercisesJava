import helpers.parser.StringToInteger;

public class FibonacciFor {
  public static void main(String[] args) {
    System.out.print("Up to which number do you want to generate Fibonacci numbers? ");
    int userChoice = StringToInteger.parseNatural();

    int secondLast = 1;
    int last = 1;
    int fib = secondLast + last;
    System.out.print(secondLast + ", " + last);

    for (fib = fib; fib <= userChoice; fib = secondLast + last) {
      System.out.print(", " + fib);
      secondLast = last;
      last = fib;
      if (fib < 1) break;
    }
  }
}
