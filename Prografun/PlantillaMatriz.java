import java.util.*;

public class PlantillaMatriz
{
    public static Scanner leer= new Scanner(System.in);
    public static int tam=50;
    
    public static void preguntas()
    {
        System.out.print("º Cuantos registros va ingresar? \nº Numero de registros :");
        tam= leer.nextInt();
    }
    
    public static void registroNotas()
    {
        
        String [] nombre= new String[tam];
        
        double [][] n1= new double[4][tam];
        double promedio;
        
        for(int i=0; i<tam; i++)
        {
            System.out.println(" ingrese nombre: ");
            nombre[i]= leer.next();
            
            for(int j=0; j<1; j++)
            {
            System.out.println("ingrese nota1: ");
            n1[i][j]= leer.nextDouble();
            
            System.out.println("ingrese nota2: ");
            n1[i][j]= leer.nextDouble();
            
            System.out.println("ingrese nota3: ");
            n1[i][j]= leer.nextDouble();
            }
        }
        System.out.println("\n\tPLANILLA DE NOTAS ");
        System.out.println("------------------------------------------------ ");
        System.out.println("\nNOMBRE\t\tNOTA1\tNOTA2\tNOTA3\tFINAL\n");
        
        for(int i=0; i<tam; i++)
        {   for(int j=0; j<1; j++)
            {
              promedio= (n1[i][j]+n1[i][j]+n1[i][j]) /3;
              System.out.println(nombre[i]+"\t\t"+n1[i][j]+"\t"+n1[i][j]+"\t"+n1[i][j]+"\t"+promedio);
            }
        }
    }
    
    public static void main()
    {
        preguntas();
        registroNotas();
    }
}
