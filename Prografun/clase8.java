

/**
 * exercise that recognizes the 5
 * param n
 * 
 */
public class clase8
{
    public static int calcular(int n)
    {
     int c=0;
      for(int a=1; a<=n/2; a++)
      {
         if(n%a==0)
         {
             c += a;
         }
      }
      return c;
    
    }
    public static boolean sonamigos(int n1, int n2)
    {
        return calcular(n1)== n2 && calcular(n2) == n1;
    }
}

