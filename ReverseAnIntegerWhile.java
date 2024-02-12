public class ReverseAnIntegerWhile {
  public static void main(String[] args) {
    System.out.println(reverseInt(4235)); // 5324
    System.out.println(reverseInt(123456789)); // 987654321
    System.out.println(reverseInt(1002)); // 2001
  }


  private static int reverseInt(int number) {
    int reverse = 0;
    while (number != 0) {
      int digit = number % 10;
      reverse = reverse * 10 + digit;
      number /= 10;
    }
    return reverse;
  }
}
