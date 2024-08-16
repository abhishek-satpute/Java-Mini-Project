import java.util.Scanner;

import java.util.Arrays;
public class SortArrayno {
     public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         System.out.println("Enter arrays size :");
         int n = s.nextInt();
         int arr [] = new int[n];
         System.out.println("Enter the Arrays element :");
           for (int i = 0; i <n; i++) {
            arr[i]=s.nextInt();
            
           }
           System.out.println("orignal  Arrays Elememt : ");
           for (int i = 0; i <n; i++) {
          System.out.print(  arr[i]);
            
           }
           System.out.println("");
          Arrays.sort(arr);
          System.out.println(" Sorted   Arrays Elememt : ");
          for (int i = 0; i <n; i++) {
         System.out.print(  arr[i]);
           
          } 

     }
}
