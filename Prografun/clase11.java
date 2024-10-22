
public class clase11
{
    public static char[] caracter={'1','2','3','4','5','6','7','8','9','0',};
    /**
     * DADO UN TEXTO INDICAR SI CONTIENE ALGUN CARACTER NUMERICO.
     */
    public static boolean haychar(String txt, char c)
    {
        return txt.indexOf(c)>=0;
    }
    public static boolean existenumero(String txt)
    {
        boolean res=false;
        for (int p=0; p<caracter.length;p++)
        {
            if(haychar(txt,caracter[p]))
            {
                res = true;
            }
        }
        return res;
}
} 

