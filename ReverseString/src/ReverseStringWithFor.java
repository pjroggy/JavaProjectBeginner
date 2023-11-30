
public class ReverseStringWithFor {

    public static void main(String[] args) {
        String input = StringInput.getUserInput();
        System.out.println("Chaine de caractère inversée de: " + input + "est: ");
        for (int i = input.length(); i > 0; --i) {
            System.out.print(input.charAt(i - 1));
        }
    }
}
