import java.util.*;
import java.util.Scanner;
public class Largest
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three integer: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>=b && a>=c)
        {
          System.out.println("Largest number"+a);
         }
      if(b>=a && b>=c)
      {
        
        System.out.println("Largest number"+b);
        
    }
    if(c>=a && c>=b)
    {
      
      System.out.println("Largest number"+c);
     }
     }
     }
     
