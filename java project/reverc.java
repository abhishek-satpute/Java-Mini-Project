import java.util.Scanner;

public class reverc {

    int revmm(int num)

    {
        int rem , rev = 0;
        while (num > 0) {

            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        reverc obj = new reverc();
        System.out.print("Reverce number :" + obj.revmm(123));

    }
}
