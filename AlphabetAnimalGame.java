import java.util.Scanner;

public class AlphabetAnimalGame {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    String[] cpuAnimals = {"cat", "dog", "turtle", "eagle", "shark"};

    System.out.print("Name an animal: ");
    String userAnimal = input.nextLine().toLowerCase();
    char userLastLetter = userAnimal.charAt(userAnimal.length() - 1);

    String cpuChoice = "";
    for (String animal : cpuAnimals) {
      if (animal.charAt(0) == userLastLetter) {
        cpuChoice = animal;
        break;
      }
    }

    if (cpuChoice.equals("")) {
      System.out.println(
          "I don't know any animal whose name starts with '" + userLastLetter + "'. You win!");
    } else {
      System.out.println(cpuChoice + "!");
    }
  }
}
