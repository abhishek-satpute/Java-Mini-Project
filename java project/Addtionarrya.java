import java.util.*;

class Addtionarrya{
    public static void main(String[] args) {
         int sum=0;
         Scanner s= new Scanner(System.in);
         System.out.println("Enter 1st Arrya size :");
         int n =s.nextInt();
       
         System.out.println("Enter 2nd Arrya size :");
         int b=s.nextInt();
         int arr[][] = new int[n][b];
        
          for (int i = 0; i <n; i++) {
           for (int j = 0; j <b; j++) {
            System.out.println("Enter the arrya Elemnet "+arr[i][j]+":");
            arr[i][j]=s.nextInt();
           }
            
          }
       
          for (int i = 0; i <n; i++) {
           for (int j = 0; j <b; j++) {
              sum+=arr[i][j];
           }
             System.out.println();
          }
          System.out.print(    "Addtion of 2d arrays "+sum);


    }
}