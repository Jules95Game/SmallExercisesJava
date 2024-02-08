public class Front22 {
  public static void main(String[] args) {
    System.out.println(front22("kitten"));
    System.out.println(front22("Ha"));
    System.out.println(front22("abc"));
    System.out.println(front22("b"));
  }


  private static String front22(String input) {
    if (input.length() < 2) return input + input + input;
    String front = input.substring(0, 2);
    return front + input + front;
  }
}
