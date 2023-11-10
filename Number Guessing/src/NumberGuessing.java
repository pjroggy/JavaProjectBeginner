import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int randomNumber = 1 + (int)(99 * Math.random());
        int trials = 5;
        int guess;
        int i;

        System.out.println("Essaie de deviner le nombre mystère compris entre 1 et 100 " + "Tu as 5 essais.");

        for (i=0; i < trials; i++){
            System.out.println("devine le nombre: ");
            guess = scan.nextInt();

            if (randomNumber == guess) {
                System.out.println("Bien vu Sherlock !!!");
                break;
            } else if (randomNumber > guess && i != trials - 1) {
                System.out.println("le nombre est plus grand que " + guess);
            } else if (randomNumber < guess && i != trials - 1) {
                System.out.println("le nombre est plus petit que " + guess);
            }
        }

        if (i == trials){
            System.out.println("looser !!!");
            System.out.println("C'était :" + randomNumber);
        }
    }
}