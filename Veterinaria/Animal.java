/**
 *Animal class object.
 * 
 * @author (ese.joel) 
 * @version (V 0.01)
 */
public class Animal
{
    public String tipo, raza, nombre, color;
    public double peso, tamanho;
    public char genero;
    
    /**
     * Constructor-1 for objects of class Animal
     */
    public Animal()
    {
        this.tipo= "";
        this.raza= "";
        this.nombre= "";
        this.color= "";
        this.peso= 0;
        this.tamanho= 0;
        this.genero= ' ';
    }
    
    /**
     * Constructor-2 for objects of class Animal
     * 
     * @param  <tipo> de tipo String
     * @param  <nombre> de tipo String
     * @param  <genero> de tipo char
    */
    public Animal(String tipo, String raza, String nombre, String color, double peso, double tamanho, char genero)
    {
        this.tipo= tipo;
        this.raza= raza;
        this.nombre= nombre;
        this.color= color;
        this.peso= peso;
        this.tamanho= tamanho;
        this.genero= genero;
        
    }

    /**
     * Constructor-3 for objects of class Animal
     * 
     * @param  <tipo> de tipo String
     * @param  <nombre> de tipo String
     * @param  <genero> de tipo char
    */
    public Animal(String tipo, String nombre, char genero)
    {
        this.nombre= nombre;
        this.tipo= tipo;
        this.genero= genero;
    }
    
    /**
     * Metodo setTipo
     * 
     * @param  <tipo> de tipo String
     * @return  void 
     */
    public void setTipo(String tipo)
    {
        this.tipo= tipo;
    }

    /**
     * Metodo setRaza
     * 
     * @param  <raza> tipo String
     * @return  void 
     */
    public void setRaza(String raza)
    {
        this.raza= raza;
    }
    
    /**
     * Metodo setNombre
     * 
     * @param  <nombre> tipo String
     * @return  void 
     */
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
    /**
     * Metodo setColor
     * 
     * @param  <color> tipo String
     * @return  void 
     */
    public void setColor(String color)
    {
        this.color= color;
    }
    
    /**
     * Metodo setPeso
     * 
     * @param  <peso> tipo double
     * @return  void 
     */
    public void setPeso(double peso)
    {
        this.peso= peso;
    }
    
    /**
     * Metodo setTamanho
     * 
     * @param  <tamanho> tipo double
     * @return  void 
     */
    public void setTamaho(double tamanho)
    {
        this.tamanho= tamanho;
    }
    
    /**
     * Metodo setGenero
     * 
     * @param <genero> tipo char
     * @return void
    */
    public void setGenero(char genero)
    {
        this.genero= genero;
    }
    
    
    
    /**
     * Metodo getTipo
     * 
     * @return  String
     */
    public String getTipo()
    {
        return this.tipo;
    }
    
    /**
     * Metodo getRaza
     * 
     * @return  String
     */
    public String getRaza()
    {
        return this.raza;
    }
    
    /**
     * Metodo getNombre
     * 
     * @return  String
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Metodo getColor
     * 
     * @return  String
     */
    public String getColor()
    {
        return this.color;
    }
    
    /**
     * Metodo getPeso
     * 
     * @return  double
     */
    public double getPeso()
    {
        return this.peso;
    }
    
    /**
     * Metodo getTamanho
     * 
     * @return  double
     */
    public double getTamanho()
    {
        return this.tamanho;
    }
    
    /**
     * Metodo getGenero
     * 
     * @return  char
     */
    public char getGenero()
    {
        return this.genero;
    }
    
}