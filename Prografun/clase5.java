import java.util.Scanner;
/**
 * exercise that recognizes the 5
 * param n
 * 
 */
public class clase5
{
    public static boolean numeromultiple(int n, int a)
    {
     boolean p= false;
     int c;
      while(n>0)
      {
         c=n%10;
         if(c==a)
         {
             p=true;
             n=0;
         }
         n=n/10;
      }
      return p;
    }
}
