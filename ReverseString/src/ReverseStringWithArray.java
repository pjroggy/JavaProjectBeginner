
public class ReverseStringWithArray {

    public static void main(String[] arg){
        // avec Array
        String input = StringInput.getUserInput();
        char[] ch = input.toCharArray();
        System.out.println("Chaine de caractère inversée: ");
        int j = ch.length;
        for (int i = j; i>0; i--){
            System.out.print(ch[i-1]);
        }
    }
}
