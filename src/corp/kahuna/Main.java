package corp.kahuna;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose one of the following options");
        System.out.println("1 - Cappuchino");
        System.out.println("2 - Latte'");
        System.out.println("3 - Americano");
        System.out.println("4 - Mocha");
        System.out.println("5 - Macciato");
        System.out.println("6 - Expresso");
        System.out.println("7 - Quit Program");

        String userChoice = scanner.nextLine();
        System.out.println("You chose " + userChoice);

        scanner.close();
    }
}
