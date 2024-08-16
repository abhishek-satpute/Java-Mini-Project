import java.util.Scanner;

public class Alleven {
     public static void main(String[] args) {
         Scanner s= new Scanner(System.in);

         System.out.println("Enter the Arryas size :");
         int n= s.nextInt();
          int arr[]= new int[n];
         System.out.println("Enter the arrays Element :");
  for (int i = 0; i < arr.length; i++) {
    arr[i]=s.nextInt();

    
  }
  System.out.println(" Origanl  arrays Element :");
  for (int i = 0; i < arr.length; i++) {
     System.out.println(arr[i]);

    
  }
  System.out.println(" All even Number ::");
  for (int i = 0; i < arr.length; i++) {
     if (arr[i]%2==0) {
        System.out.println(" Even "+arr[i]);
        
     }


    
  }

     }
    
}
