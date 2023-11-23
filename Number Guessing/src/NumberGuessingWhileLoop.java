import java.util.Scanner;
public class NumberGuessingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int secretNumber = 1+(int)(Math.random() * 99);
    int guess = 0;
    int trials = 0;

    System.out.println("Essaie de deviner le nombre mystère compris entre 0 et 100");

    while (guess != secretNumber){
        System.out.print("Entrez un nombre :");
        guess = scanner.nextInt();
        trials++;

        if (guess < secretNumber){
            System.out.println("le nombre est plus grand que " + guess);
        }else if (guess > secretNumber){
            System.out.println("le nombre est plus petit que " + guess);
        }else {
            System.out.println("bien joué sherlock !! Vous avez deviné le nombre " + secretNumber + " en " + trials + " tentatives !");
        }
    }
    }
}
