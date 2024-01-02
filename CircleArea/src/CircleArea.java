import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le rayon du cercle :");
        double rayon = scanner.nextDouble();
        if (rayon < 0.0 ){
            System.out.println("le rayon doit avoir une valeur positive");
        }else {
            double aire = Math.PI * (rayon * rayon);
            System.out.println("l'aire du cercle est :" + aire);
        }
    }
}
