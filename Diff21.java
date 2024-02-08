public class Diff21 {
  public static void main(String[] args) {
    System.out.println(diff21(19)); //  2
    System.out.println(diff21(10)); // 11
    System.out.println(diff21(21)); //  0
    System.out.println(diff21(22)); //  2
    System.out.println(diff21(34)); // 26
  }


  private static int diff21(int n) {
    if (n > 21) {
      return Math.abs(n - 21) * 2;
    } else {
      return Math.abs(n - 21);
    }
  }
}
