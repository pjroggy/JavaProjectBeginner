
public class ReverseStringWithRecursion {

    String reverse(String s) {
        if (s.length() == 0)
            return " ";
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    public static void main(String[] arg) {
        ReverseStringWithRecursion rev = new ReverseStringWithRecursion();
        String input = StringInput.getUserInput();
        System.out.println("La chaine de caractère inversée est : " + rev.reverse(input));
    }
}
