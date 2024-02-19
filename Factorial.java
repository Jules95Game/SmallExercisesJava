import helpers.parser.StringToInteger;

public class Factorial {
  public static void main(String[] rgs) {
    System.out.print("Please enter an integer greater then zero: ");
    int userChoice = StringToInteger.parseNatural();

    int result = 1;
    for (int i = userChoice; i > 0; i--) {
      result *= i;
      // ToDo: use BigInteger
      if (result < 0) {
        System.out.println("The result is larger then a 32-bit integer can hold.");
        return;
      }
    }

    System.out.println("The factorial of " + userChoice + " is " + result);
  }
}
