import java.util.Scanner;

public class ReverseStringWithRecursion {

    String reverse(String s){
        if (s.length() == 0)
            return " ";
        return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
    public static void main (String[] arg){
        ReverseStringWithRecursion rev = new ReverseStringWithRecursion();
        Scanner scan = new Scanner(System.in);
        System.out.print("entrer une chaine de caractère: ");
        String string = scan.nextLine();
        System.out.println("chaine de caractère inversée: " + rev.reverse(string));
    }
}
