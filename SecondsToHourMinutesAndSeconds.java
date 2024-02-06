import java.util.Scanner;

public class SecondsToHourMinutesAndSeconds {
  public static void main(String[] args) {
    System.out.println(secondsToHms(86399));
    System.out.println(secondsToHms(43860));
    System.out.println(secondsToHms(55775));

    System.out.print("\nEnter the amount of seconds you want to convert: ");
    Scanner inputScanner = new Scanner(System.in);
    int userSeconds = inputScanner.nextInt();
    System.out.println(secondsToHms(userSeconds));
  }

  private static String secondsToHms(int totalSeconds) {
    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;
    return hours + ":" + minutes + ":" + seconds;
  }
}
