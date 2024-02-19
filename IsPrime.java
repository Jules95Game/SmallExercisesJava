import helpers.parser.StringToInteger;

public class IsPrime {
  public static void main(String[] args) {
    System.out.print("Enter an integer: ");
    int userChoice = StringToInteger.parseNatural();

    if (isPrime(userChoice)) {
      System.out.print(userChoice + " is a prime number");
    } else {
      System.out.print(userChoice + " is not a prime number");
    }
  }


  private static boolean isPrime(int input) {
    if (input == 1) return false;
    for (int i = 2; i < input; i++) {
      if (input % i == 0) return false;
    }
    return true;
  }
}
