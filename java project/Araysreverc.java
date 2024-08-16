import java.util.*;

public class Araysreverc {
    public static void main(String[] args) {
         Scanner s= new  Scanner(System.in);
         System.out.println("Enter the 1st  arrays  Size :");
         int row = s.nextInt();
         System.out.println("Enter the 1st  arrays  Size :");
         int colm= s.nextInt();
         int arr[][]= new int [row][colm];
         System.out.println("Enter arrays Element");
          for (int i = 0; i <  row; i++) {
            for (int j = 0; j < colm; j++) {
                  
                arr[i][j]=s.nextInt();
            }
            
          }

          System.out.println("Reverc  arrays Element");
          for (int i = row-1; i >= 0; i--) {
            for (int j = colm-1; j >=0; j--) {
                  
              System.out.print(" "+arr[i][j]);
            }
            System.out.println(" ");
          }
          System.out.println(" ");

    }
}
