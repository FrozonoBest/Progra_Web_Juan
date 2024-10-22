public class clase6
{
    /**
     * funcion que indica cuantas letras tiene un texto
     */
    public static int contarletras(String texto)
    {
        int cantidad=0;
        cantidad= texto.length();// return texto .length();
        return cantidad;
        
    }
    
    /**
     * funcion que indica SI AU UN CARACTER EXISTE EN LA PALABRA
     */
    public static boolean identificador(String a, String b)
    {
        boolean p= false;
        int n;
        n= a.indexOf(b);
        if (n != -1)
        {
            p= true;
        }
        return p;
    }
    
    /**
     * comparar dos textos SI SON IGUALES
     */
    public static boolean igualar(String a, String b)
    {
        boolean p= false;
        p= a.equalsIgnoreCase(b);
        return p;
    }
    /**
     * 
     */
}
