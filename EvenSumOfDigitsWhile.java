public class EvenSumOfDigitsWhile {
  public static void main(String[] args) {
    int count = 100;
    while (count < 150) {
      int number = count;
      int sumOfDigits = 0;

      while (number != 0) {
        int digit = number % 10;
        sumOfDigits += digit;
        number /= 10;
      }

      if (sumOfDigits % 2 == 0) {
        System.out.println(count);
      }
      count++;
    }
  }
}
