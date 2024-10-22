import java.util.Scanner;
/**
 * greater than two numbers
 * parame a intiger
 * parame b intiger
 * resturn integer largest number
 */
public class clase2
{
    public static int numeromayor(int a,int b)
    {
     int mayor;
    
     if (a>b)
     {
         mayor=a;     
     }
     else
     {
         mayor=b;
     }
     return mayor;
    }
}