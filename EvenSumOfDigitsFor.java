public class EvenSumOfDigitsFor {
  public static void main(String[] args) {
    for (int count = 100; count < 150; count++) {
      int number = count;
      int sumOfDigits = 0;

      for (int i = number; i != 0; i = number) {
        int digit = number % 10;
        sumOfDigits += digit;
        number /= 10;
      }

      if (sumOfDigits % 2 == 0) {
        System.out.println(count);
      }
    }
  }
}
