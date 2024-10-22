
public class clase13
{
    /**
     * 
     */
    public static boolean haychar(String txt, char x)
    {
        return txt.charAt(0) == x;
    }
    
    /**
     * funcion que abre una puerta dado cualquier menos con la (M) si es mayor a 18 y si es femenino
    */
    public static boolean haychar(String nombre, int edad, String genero)
    {
        boolean res=false;
        
        if (edad >= 18 && genero.equalsIgnoreCase("femenino")&& !haychar(nombre,'M'))
        {
            return true;
        }
        return res;
    }
    
} 