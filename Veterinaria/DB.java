
public class DB
{
    public static Animal[] animal= new Animal[100];
    public static int ia= 0;

    public static Duenho[] duenho= new Duenho[100];
    public static int id= 0;

    public static Medicamento[] medicamento= new Medicamento[100];
    public static int im= 0;

    public static Historial[] historial= new Historial[100];
    public static int ih= 0;

    public static Personal[] personal= new Personal[100];
    public static int ip= 0;
    
    public static Pez[] pez= new Pez[100];
    public static int ipz= 0;
    
    public static Ave[] ave= new Ave[100];
    public static int iv= 0;
    
    /////////////////PEZ///////////////////////////
    public static void registrarPez(Pez p)
    {        
            pez[ipz]= p;
            ipz++;
    }
    
    ////////////////AVE/////////////////////
    public static void registrarAve(Ave v)
    {        
            ave[iv]= v;
            iv++;
    }
    
    /////////////////ANIMAL//////////////////////////
    public static void registrarAnimal(Animal an)
    {        
            animal[ia]= an;
            ia++;
    }
    
    public static Animal mostrarUltAnimal()
    {
        return animal[ia-1];
    }
    
    public static Animal animalPos(int pos)
    {
        return animal[pos];
    }
    
    public static Pez pezPos(int pos)
    {
        return pez[pos];
    }
    
    public static Ave avePos(int pos)
    {
        return ave[pos];
    }
}
