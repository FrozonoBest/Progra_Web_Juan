import java.util.Scanner;

public class clase7
{
    public static Scanner leer= new Scanner(System.in);
public static void registroAltura()
{
    double []altura=  new double[6];

    
    for (int p=0; p<6; p++)
    {
        System.out.println("Ingrese altura: ");
        altura[p]= leer.nextDouble();

    }
    System.out.println("los datos son: \n");
    for (int p=0; p<6; p++)
    {
        System.out.println(altura[p]);
    }

}

}

