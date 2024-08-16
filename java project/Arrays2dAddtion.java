import java.util.Scanner;

public class Arrays2dAddtion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrya1  row size :");
        int row1 = sc.nextInt();
        System.out.println("Enter arrya1  col size :");
        int col1 = sc.nextInt();
        System.out.println("Enter arrya2  row size :");
        int row2 = sc.nextInt();
        System.out.println("Enter arrya2  col size :");
        int col2 = sc.nextInt();
        int arr1[][] = new int[row1][col1];
        int arr2[][] = new int[row2][col2];
        int arr3[][] = new int[arr1.length][arr2.length];
        System.out.println(" Enter arrays  element  Arrays1  row & col:");
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        System.out.println(" Enter arrays  element  Arrays1  row & col:");
        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }

        System.out.println("  2d Arrays2  display  :");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];

                System.out.print(arr3[i][j]);
            }
            System.out.println(" ");
        }
    }
}
