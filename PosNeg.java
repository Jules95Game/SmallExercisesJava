public class PosNeg {
  public static void main(String[] args) {
    System.out.println(posNeg(1, -1, false)); // true
    System.out.println(posNeg(-1, 1, false)); // true
    System.out.println(posNeg(-4, -5, true)); // true
  }


  private static boolean posNeg(int num1, int num2, boolean negative) {
    if (negative) return num1 < 0 && num2 < 0;

    return num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0;
  }
}
