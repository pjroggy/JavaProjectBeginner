import java.util.Scanner;

public class ReverseStringWithWhile {

    public static void main(String[] args) {
        String string;
        Scanner scan = new Scanner (System.in);
        System.out.print("entrer une chaine de caractère: ");
        string = scan.nextLine();
        System.out.println("Chaine de charactère inversée de: " + string + " est: ");
        int i = string.length();
        while (i>0){
            System.out.print(string.charAt(i-1));
            i--;
        }
    }
}
