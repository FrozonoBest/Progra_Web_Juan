import java.util.Scanner;
/**
 * function that indicates whether an integer or is even
 * param n 
 * param mo
 */
public class clase3
{
    public static boolean numeropar(int n)
    {
     boolean mo;
     
     if (n % 2 == 0)
     {
       mo=true;       
     }
     else
     {
        mo=false;
     }
     return mo;
    }
    
    
    
    
    
 public static boolean numeroimp(int n)
    {
     boolean mo;
     mo=n%2==0?true:false;
     return mo;
    } 
}
