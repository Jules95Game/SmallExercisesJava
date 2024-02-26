public class NoTriples {
  public static void main(String[] args) {
    System.out.println(noTriples(1, 1, 2, 2, 1)); // true
    System.out.println(noTriples(1, 1, 2, 2, 2, 1)); // false
    System.out.println(noTriples(1, 1, 1, 2, 2, 2, 1)); // false
    System.out.println(noTriples(1, 1)); // true
  }


  private static boolean noTriples(int... numbers) {
    for (int i = 0; i < numbers.length; i++) {
      if (i < 2) continue;
      if (numbers[i] == numbers[i - 1] && numbers[i] == numbers[i - 2]) return false;
    }
    return true;
  }
}
