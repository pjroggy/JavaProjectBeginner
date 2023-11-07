import java.util.Scanner;

public class ReverseStringWithArray {

    public static void main(String[] arg){
        // avec Array
        String string;
        Scanner scan = new Scanner(System.in);
        System.out.print("entrer une chaine de caractère: ");
        string = scan.nextLine();
        char[] ch = string.toCharArray();
        System.out.println("Chaine de caractère inversée: ");
        int j = ch.length;
        for (int i = j; i>0; i--){
            System.out.print(ch[i-1]);
        }
    }
}
