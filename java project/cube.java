import java.util.Scanner;

class cube
    
{
      int cube1(int a)
      {
        return a*a*a;

      }
    public static void main(String[] args) {
     Scanner  s= new Scanner(System.in); 
     System.out.println(" Enter the  number ");
      int a =s.nextInt();
      cube obj=  new cube();
      System.out.println("Cube of :"+obj.cube1(a));
      
         
    }
}