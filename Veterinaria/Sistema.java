/**
 *Sistema Vetel.
 * 
 * @author (ese.joel) 
 * @version (V0.01)
 */
import java.util.Scanner;
public class Sistema
{

    public Scanner sc= new Scanner(System.in);
    public int op;

    public void registroAve()
    {
        String t,n,c,r,a;
        char g;
        double p,tho;
        boolean v;
        System.out.println("Registro Pez\n____________________________");
        System.out.println("Tipo: ");
        t= sc.next();
        System.out.println("Raza: ");
        r= sc.next();
        System.out.println("Nombre: ");
        n= sc.next();
        System.out.println("Color: ");
        c= sc.next();
        System.out.println("Peso: ");
        p= sc.nextDouble();
        System.out.println("Tamaño: ");
        tho= sc.nextDouble();
        System.out.println("Genero: ");
        g= sc.next().charAt(0);
        System.out.println("Volar: ");
        v= sc.nextBoolean();

        Ave rv= new Ave(t, r, n, c, g, p, tho, v);
        DBA.setAve(rv);
        System.out.println("Registro correcto.");
    } 

    public void registroPez()
    {
        String t,n,c,r,a;
        char g;
        double p,tho;
        System.out.println("Registro Pez\n____________________________");
        System.out.println("Tipo: ");
        t= sc.next();
        System.out.println("Raza: ");
        r= sc.next();
        System.out.println("Nombre: ");
        n= sc.next();
        System.out.println("Color: ");
        c= sc.next();
        System.out.println("Peso: ");
        p= sc.nextDouble();
        System.out.println("Tamaño: ");
        tho= sc.nextDouble();
        System.out.println("Genero: ");
        g= sc.next().charAt(0);
        System.out.println("Ambiente: ");
        a= sc.next();

        Pez rp= new Pez(t, r, n, c, p, tho, g, a);
        DBA.setPez(rp);
        System.out.println("Registro correcto.");
    } 

    ///////////////////////////////////////////////////////////////////////////
    public void registroAnimal()
    {
        String t,n,c,r;
        char g;
        double p,tho;
        System.out.println("Registro Animal\n____________________________");
        System.out.println("Tipo: ");
        t= sc.next();
        System.out.println("Raza: ");
        r= sc.next();
        System.out.println("Nombre: ");
        n= sc.next();
        System.out.println("Color: ");
        c= sc.next();
        System.out.println("Peso: ");
        p= sc.nextDouble();
        System.out.println("Tamaño: ");
        tho= sc.nextDouble();
        System.out.println("Genero: ");
        g= sc.next().charAt(0);
        Animal ra= new Animal(t, r, n, c, p, tho, g);
        DBA.setAnimal(ra);
        System.out.println("Registro correcto.");
    }   

    public void menu()
    {
        System.out.println("MENU\n=========================\n");
        System.out.println("1.- Registrar Animal.");
        System.out.println("2.- Registrar Historial.");
        System.out.println("3.- Completar Datos del Dueño.");
        System.out.println("4.- Registrar Nuevo Personal.");
        System.out.println("5.- Registrar un Medicamento.");
        System.out.println("6.- Ultimo Animal Registrado.");
        System.out.println("7.- Buscar animal.");
        System.out.println("8.- Registrar un Pez.");
        System.out.println("9.- Buscar Pez.");
        System.out.println("10.- Registrar una Ave.");
        System.out.println("11.- Buscar Ave.");
        System.out.println("0.- Salir");
        System.out.print("\nSeleccione una de las opciones: ");
        op= sc.nextInt();

    }

    public void ejecutarOp()
    {
        int nr;
        switch(op){
            case 1: registroAnimal();
                break;
            case 6: DBA.getUltAnimal();
                break;
            case 7: 
                System.out.println("Ingrese número de registro: ");
                nr= sc.nextInt();
                DBA.getAnimalPos(nr);
                break;
            case 8: registroPez();
                break;
            case 9: 
                System.out.println("Ingrese número de registro: ");
                nr= sc.nextInt();
                DBA.getPezPos(nr);
                break;
            case 10: registroAve();
                break;
            case 11: 
                System.out.println("Ingrese número de registro: ");
                nr= sc.nextInt();
                DBA.getAvePos(nr);
                break;  
            case 0: System.out.println("FINALIZADO......!!!!!!");
                break;            
            default: System.out.print("Opción Incorrecta");
                break;
        }       
    }

    public void main ()
    {
        do{
            menu();  
            ejecutarOp();                     
        } while(op != 0);
    }
}