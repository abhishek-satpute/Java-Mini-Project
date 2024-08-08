import java.util.Scanner;

public class claculater {
    public static void main(String[] args) {
        int choice, a, b, c;
        Scanner obj = new Scanner(System.in);
        System.out.println("1.Addtion");
        System.out.println("2.subtraction");
        System.out.println("3.multipiction");
        System.out.println("4.Division  ");
        System.out.println("5.Moduls");
        System.out.print(" Enter your choice :");
        choice = obj.nextInt();
        System.out.println("Enter the 1st number :");
        a = obj.nextInt();
        System.out.println("Enter the 2nd number :");
        b = obj.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addtion of tow number n:" + (a + b));
                break;
            case 2:
                System.out.println("subtraction of two number :" + (a - b));
                break;
            case 3:
                System.out.println("multipcation of two number :" + (a * b));
                break;
            case 4:
                System.out.println("Division  of two number :" + (a / b));
                break;
            case 5:
                System.out.println("moduls  of two number :" + (a % b));
                break;

            default:
                System.out.println("Invalide  Choice :");
                break;
        }

    }
}
