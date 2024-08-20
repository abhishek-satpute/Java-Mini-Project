import java.util.*;

public class prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = 0, i = 1;
        System.out.println("Enter the number :");
        int num = s.nextInt();
    while (i <= num) {
            if (num % i == 0) {
              j++; 
            }

            i++;
        }

        if (j == 2) {
            System.out.println("Prime number :");
        } else {
            System.out.println(" is not Prime number :");
        }
    }
}
