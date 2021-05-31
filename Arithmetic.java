import java.util.Scanner;

public class Arithmetic
{
    public static void main(String args[])
    {  
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers"); 
        int i= sc.nextInt();
        int j= sc.nextInt();

        System.out.println("Addition is = "+(i+j));


        System.out.println("subtraction is = "+ (i-j));
        
        System.out.println("multiplication is = "+(i*j));
        
        System.out.println("divison is = "+(i/j));

        
        System.out.println("end of program");
    }
}