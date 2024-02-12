public class NotString {
  public static void main(String[] args) {
    System.out.println(notString("candy")); // "not candy"
    System.out.println(notString("x")); // "not x"
    System.out.println(notString("not bad")); // "not bad"
    System.out.println(notString("XP")); // "not XP"
  }


  private static String notString(String input) {
    if (input.length() >= 3 && input.substring(3).equals("not")) return input;

    return "not " + input;
  }
}
