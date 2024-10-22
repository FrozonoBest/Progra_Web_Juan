import java.util.*;

public class PlantillaDeNotas
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
        double [] n1= new double[tam];
        double [] n2= new double[tam];
        double [] n3= new double[tam];
        double promedio;
        
        for(int i=0; i<tam; i++)
        {
            System.out.println(" ingrese nombre: ");
            nombre[i]= leer.next();
            
            System.out.println("ingrese nota1: ");
            n1[i]= leer.nextDouble();
            
            System.out.println("ingrese nota2: ");
            n2[i]= leer.nextDouble();
            
            System.out.println("ingrese nota3: ");
            n3[i]= leer.nextDouble();
        }
        System.out.println("\n\tPLANILLA DE NOTAS ");
        System.out.println("------------------------------------------------ ");
        System.out.println("\nNOMBRE\t\tNOTA1\tNOTA2\tNOTA3\tFINAL\n");
        
        for(int i=0; i<tam; i++)
        {
            promedio= (n1[i]+n2[i]+n3[i]) /3;
            
            System.out.println(nombre[i]+"\t\t"+n1[i]+"\t"+n2[i]+"\t"+n3[i]+"\t"+promedio);
        }
    }
    
    public static void main()
    {
        preguntas();
        registroNotas();
    }
}
