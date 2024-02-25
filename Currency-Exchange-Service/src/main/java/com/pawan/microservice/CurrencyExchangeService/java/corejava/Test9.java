package corejava;

public class Test9 {

    public static void main(String[] args) {
        String str = "aybxxbbchhhjkkkkla";
        char c = ' ';
        int index = -1;


        for (char ch: str.toCharArray()) {
                    if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                        c=ch;

                break;
            } else {

                index += 1;
            }
        }

        System.out.println("First Non repeating char :: " + c);
    }
}
