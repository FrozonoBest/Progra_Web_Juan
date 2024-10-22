import java.util.Scanner;

public class Clase0
{
    /** 
     * Metodo que permite contar los digitos de un numero entero
     * 
     * @param  numero de tipo entero positivo
     * @return  res  que es la cantidad de digitos
     */
    public static int contadorDigitos(int numero)
    {
        int res=0;        
        while(numero>0)//Bucle que controla si el numero tiene digitos
        {
            res++;
            numero/=10;
        }        
        return res;
    }
    
    /**
     * Metodo que permite calcular la potencia de un numero
     * 
     * @param   a entero positivo
     * @param   b entero positivo
     * @return  res     el la potencia calculada
     */
    public static int pote(int a, int b)
    {
        int res=1;
        while(b>0)
        {
            res= res * a;
            b--;
        }
        return res;        
    }
    
    /**
     * Metodo para invertir un numero entero positivo
     * 
     * @param   numero de tipo entero
     * @return  res     el numero invertido
     */
    public static int invertir(int numero)
    {
        int res=0,dig,cantd;
        cantd= contadorDigitos(numero) -1;
        for(;numero>0;numero/=10)
        {
            dig= numero % 10;            
            res= res + (dig * pote(10,cantd));
            cantd--;
        }     
        
        return res;
    }
    
    
    public static Scanner leer=new Scanner(System.in);
    
    public static void main()
    {
        int n;
        System.out.println("Ingrese un numero: ");
        n= leer.nextInt();
        if(n == invertir(n))
        {
            System.out.println("Es capicua");
        }
        else
        {
            System.out.println("No es capicua");
        }
        
    }
}

