public class ArrayFront9 {
  public static void main(String[] args) {
    System.out.println(arrayFront9(new int[] {1, 2, 9, 3, 4})); // true
    System.out.println(arrayFront9(new int[] {1, 2, 3, 4, 9})); // false
    System.out.println(arrayFront9(new int[] {1, 2, 3, 4, 5})); // false
    System.out.println(arrayFront9(new int[] {1, 2, 3})); // false
    System.out.println(arrayFront9(new int[] {1, 2, 9})); // true
  }


  private static boolean arrayFront9(int[] numbers) {
    int endAt = 4;
    if (numbers.length < endAt) endAt = numbers.length;

    for (int i = 0; i < endAt; i++) {
      if (numbers[i] == 9) return true;
    }
    return false;
  }
}
