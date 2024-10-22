import java.util.Scanner;
/**
 * greater than two numbers
 * parame a intiger
 * parame b intiger
 * resturn integer largest number
 */
public class clase4
{
    public static int divisores(int n)
    {
     int m=1, p=0;
    
     while (m<=n)
     {
         if(n%m==0)
         {
             p++;
         }
         m++;
     }
     
     return p;
    }
}
