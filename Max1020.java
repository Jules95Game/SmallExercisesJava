public class Max1020 {
  public static void main(String[] args) {
    System.out.println(max1020(11, 19)); // 19
    System.out.println(max1020(19, 11)); // 19
    System.out.println(max1020(11, 9)); // 11
    System.out.println(max1020(10, 9)); // 10
    System.out.println(max1020(9, 9)); // 0
  }


  private static int max1020(int num1, int num2) {
    if (num1 < 10 || num1 > 20 && num2 < 10 || num2 > 20) return 0;

    return num1 > num2 ? num1 : num2;
  }
}
