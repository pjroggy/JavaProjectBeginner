import java.util.Scanner;

public class StringInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        System.out.print("Entrez une chaine de caractère ; ");
        return scanner.nextLine();
    }

    public static void closeScanner() {
        scanner.close();
    }
}
