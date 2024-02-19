public class EveryNth {
  public static void main(String[] args) {
    System.out.println(everyNth("Miracle", 2)); // "Mrce"
    System.out.println(everyNth("abcdefg", 2)); // "aceg"
    System.out.println(everyNth("abcdefg", 3)); // "adg"
  }


  private static String everyNth(String input, int nth) {
    String result = "";
    for (int i = 0; i < input.length(); i++) {
      if (i % nth == 0) {
        result += input.charAt(i);
      }
    }
    return result;
  }
}
