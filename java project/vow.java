import java.util.*;

public class vow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String name = s.next();
        System.out.println("vowel  given string :" + " ");
        for (int i = 0; i <= name.length(); i++) {
            if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O'
                    || name.charAt(i) == 'U' || name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i'
                    || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                System.out.print(name.charAt(i) + "");
            }
        }

    }
}
