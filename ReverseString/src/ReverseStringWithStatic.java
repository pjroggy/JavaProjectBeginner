import java.util.Scanner;

public class ReverseStringWithStatic {
    public static void main(String[] args) {
// avec méthode static
        ReverseStringWithStatic rev = new ReverseStringWithStatic();
        Scanner scan = new Scanner(System.in);
        System.out.println("entrer une chaine de caractère: ");
        String str = scan.nextLine();
        System.out.println("chaine de caractère inversée : " + rev.reverse(str));
    }

    static String reverse(String string){
        String rev = "";
        for (int i = string.length(); i >0; --i){
            rev = rev + (string.charAt(i-1));
        }
        return rev;
    }



}

