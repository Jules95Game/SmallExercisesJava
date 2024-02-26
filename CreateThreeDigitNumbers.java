public class CreateThreeDigitNumbers {
  public static void main(String[] args) {

    int count = 0;
    for (int firstDigit = 1; firstDigit < 5; firstDigit++) {

      for (int secondDigit = 1; secondDigit < 5; secondDigit++) {

        if (secondDigit == firstDigit) continue;
        for (int thirdDigit = 1; thirdDigit < 5; thirdDigit++) {

          if (thirdDigit == firstDigit || thirdDigit == secondDigit) continue;
          count++;
          System.out.println(firstDigit * 100 + secondDigit * 10 + thirdDigit);
        }
      }
    }
    System.out.println("Total number of three-digit-numbers is " + count);
  }
}
