import java.util.Scanner;

public class IntegerSum {

        public static void main(String[] args) {

            System.out.println("Entrer deux nombres pour une addition: ");
            Scanner readInput = new Scanner(System.in);
            System.out.println("premier nombre a: ");
            int a = readInput.nextInt();
            System.out.println("premier nombre b: ");
            int b = readInput.nextInt();
            readInput.close();

            System.out.println("La somme de " + (a)  + " et " + (b) + " est = " + Integer.sum(a, b));
        }
}