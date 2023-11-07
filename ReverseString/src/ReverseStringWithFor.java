import java.io.PrintStream;
import java.util.Scanner;

public class ReverseStringWithFor {

    public static void main(String[] args) {
        String string;
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer une chaine de caractère: ");
        string = scan.nextLine();
        System.out.println("Chaine de caractère inversée de: " + string + "est: ");
        for(int i = string.length(); i>0; --i){
            System.out.println(string.charAt(i-1));
        }
    }
}
