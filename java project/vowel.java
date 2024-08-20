import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in );
      System.out.println("Please Enter the only  charater : ");
       char ch =s.next().charAt(0);
        if(ch =='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U'||ch =='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
            System.out.println("This is vowel :"+ch);

        } 
        else if(ch =='1'|| ch=='2'||ch=='3'|| ch=='4'||ch=='5'||ch =='5'|| ch=='6'||ch=='7'|| ch=='8'||ch=='9'||ch=='0')
        {
            System.out.println("This is  number  : "+ch);

        } 
        else if(ch =='!'|| ch=='@'||ch=='$'|| ch=='^'||ch=='%'||ch =='/'|| ch==':'|| ch=='&'||ch=='*')
        {
            System.out.println("This is Specail character  : "+ch);

        } 
        else
        {
            System.out.println("this constant :");
        }
    }
}
