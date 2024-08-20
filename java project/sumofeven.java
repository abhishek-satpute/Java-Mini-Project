import java.util.Scanner;

public class sumofeven {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number :");
         int n= s.nextInt();
          int arr[]= new int[n];
          
          System.out.println("arrays element : :");
          for (int i = 0; i <n; i++) {
           
               arr[i]=s.nextInt();
          }
            
          System.out.println("f even number :");
          for (int i = 0; i <n; i++) {
           
           if (arr[i]%2==0) {
               System.out.print(arr[i]);
               sum+=arr[i];
           }
        
          }
          System.out.println("Sum Sum of even number"+sum);
    }
}
