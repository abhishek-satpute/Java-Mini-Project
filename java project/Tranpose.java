import java.util.Scanner;

public class Tranpose {
     public static void main(String[] args) {
         Scanner s= new  Scanner(System.in );
          System.out.println(" Enter the arrays size :");
          int r= s.nextInt();
          System.out.println(" Enter the arrays size :");
          int c= s.nextInt();
           int arr[][]= new int[r][c];
           System.out.println(" Enter the Arrays Element : ");
           for (int i = 0; i <r; i++) {
             for (int j = 0; j < c; j++) {
                 arr[i][j] =s.nextInt();

             }
           }
           System.out.println("  Origanl  Arrays Element : ");
           for (int i = 0; i <r; i++) {
             for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] ); 

             }
             System.out.println("");
           }
           System.out.println("  Change Arrays Element : ");
           for (int i = 0; i <r; i++) {
             for (int j = 0; j < c; j++) {
            System.out.print(arr[j][i]);

             }
             System.out.println("");
           }



     }
    
}
