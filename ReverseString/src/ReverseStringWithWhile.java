
public class ReverseStringWithWhile {

    public static void main(String[] args) {
        String input = StringInput.getUserInput();
        System.out.println("Chaine de charactère inversée de: " + input + " est: ");
        int i = input.length();
        while (i > 0) {
            System.out.print(input.charAt(i - 1));
            i--;
        }
    }
}
