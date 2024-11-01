
public class DBA
{
    public static void setAnimal(Animal a)
    {
        Animal adb= new Animal();
        if(a.color != "")
            adb.color= a.color;
        else 
            adb.color= "Sin Color";

        if(a.genero == 'M' || a.genero == 'H')
            adb.genero= a.genero;
        else 
            adb.genero= '-';
            
        adb.peso= a.peso>0?a.peso:0;
        adb.tamanho= a.tamanho>0?a.tamanho:0;
        adb.raza= !a.raza.equalsIgnoreCase("")?a.raza:"Sin raza";
        adb.tipo= !a.tipo.equalsIgnoreCase("")?a.tipo:"Sin tipo";
        adb.nombre= !a.nombre.equalsIgnoreCase("")?a.nombre:"Sin nombre";
        DB.registrarAnimal(adb);
    }
    
    public static void getUltAnimal()
    {
        Animal ua= DB.mostrarUltAnimal();
        getAnimal(ua);
    }
    
    public static void getAnimalPos(int pos)
    {
        Animal a;
        if (pos<=DB.ia)
        {
            a= DB.animalPos(pos-1);
            getAnimal(a);
        }
        else
        {
            System.out.println("ERROR: Registro no encontrado.");
        }      
        
    }
    
    public static void getAnimal(Animal a)
    {
        System.out.println("\n================================================");
        System.out.println("Nombre: "+a.nombre);
        System.out.println("Tipo: "+a.tipo);
        System.out.println("Raza: "+a.raza);
        System.out.println("Color: "+a.color);
        System.out.println("Peso: "+a.peso);
        System.out.println("Tamaño: "+a.tamanho);
        System.out.println("Genero: "+a.genero);
    }
    ////////////////////////////////////////////////////////////
    
    public static void setPez(Pez p)
    {   Pez pdb= new Pez();
        
        //atributo de la clase Pez
        pdb.ambiente= p.ambiente!=""?p.ambiente:"Sin ambiente";
        
        //atributo de la clase Animal
        pdb.color= p.color != ""?p.color:"Sin Color";
        pdb.genero= p.genero == 'M' || p.genero == 'H'?p.genero:'-';
        pdb.peso= p.peso>0?p.peso:0;
        pdb.tamanho= p.tamanho>0?p.tamanho:0;
        pdb.raza= !p.raza.equalsIgnoreCase("")?p.raza:"Sin raza";
        pdb.tipo= !p.tipo.equalsIgnoreCase("")?p.tipo:"Sin tipo";
        pdb.nombre= !p.nombre.equalsIgnoreCase("")?p.nombre:"Sin nombre";
        DB.registrarPez(pdb);
    }
    
    public static void getPezPos(int pos)
    {
        Pez p;
        if (pos<=DB.ipz)
        {
            p= DB.pezPos(pos-1);
            getPez(p);
        }
        else
        {
            System.out.println("ERROR: Registro no encontrado.");
        }      
        
    }
    
    public static void getPez(Pez a)
    {
        System.out.println("\n================================================");
        System.out.println("Nombre: "+a.nombre);
        System.out.println("Tipo: "+a.tipo);
        System.out.println("Raza: "+a.raza);
        System.out.println("Color: "+a.color);
        System.out.println("Peso: "+a.peso);
        System.out.println("Tamaño: "+a.tamanho);
        System.out.println("Genero: "+a.genero);
        System.out.println("Ambiente: "+a.ambiente);
    }
    
    //////////////////////////////////////////////////
    public static void setAve(Ave v)
    {   Ave vdb= new Ave();
        
        //atributo de la clase Pez
        vdb.volar= v.volar == true?v.volar: false;
        /* en caso de que volar sea String su funcion seria:
         * vdb.volar= v.volar != ""?v.volar: "No Vuela";
           */
        //atributo de la clase Animal
        vdb.color= v.color != ""?v.color:"Sin Color";
        vdb.genero= v.genero == 'M' || v.genero == 'H'?v.genero:'-';
        vdb.peso= v.peso>0?v.peso:0;
        vdb.tamanho= v.tamanho>0?v.tamanho:0;
        vdb.raza= !v.raza.equalsIgnoreCase("")?v.raza:"Sin raza";
        vdb.tipo= !v.tipo.equalsIgnoreCase("")?v.tipo:"Sin tipo";
        vdb.nombre= !v.nombre.equalsIgnoreCase("")?v.nombre:"Sin nombre";
        DB.registrarAve(vdb);
    }
    
    public static void getAvePos(int pos)
    {
        Ave v;
        if (pos<=DB.iv)
        {
            v= DB.avePos(pos-1);
            getAve(v);
        }
        else
        {
            System.out.println("ERROR: Registro no encontrado.");
        }      
        
    }
    
    public static void getAve(Ave a)
    {
        System.out.println("\n================================================");
        System.out.println("Nombre: "+a.nombre);
        System.out.println("Tipo: "+a.tipo);
        System.out.println("Raza: "+a.raza);
        System.out.println("Color: "+a.color);
        System.out.println("Peso: "+a.peso);
        System.out.println("Tamaño: "+a.tamanho);
        System.out.println("Genero: "+a.genero);
        System.out.println("Ambiente: "+a.volar);
    }
}
