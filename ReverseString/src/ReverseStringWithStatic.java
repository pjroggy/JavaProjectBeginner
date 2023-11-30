
public class ReverseStringWithStatic {
    public static void main(String[] args) {
// avec méthode static
        ReverseStringWithStatic rev = new ReverseStringWithStatic();
        String input = StringInput.getUserInput();
        System.out.println("chaine de caractère inversée : " + rev.reverse(input));
    }

    static String reverse(String string) {
        String rev = "";
        for (int i = string.length(); i > 0; --i) {
            rev = rev + (string.charAt(i - 1));
        }
        return rev;
    }


}

