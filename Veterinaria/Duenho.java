/**
 * Duenho class object.
 * 
 * @author (ese.joel) 
 * @version (V 0.01)
 */
public class Duenho
{
    private String nombre, direccion, telefono;
    /**
     * Constructor for objects of class Duenho
     */
    public Duenho()
    {
        this.nombre= "";
        this.direccion= "";
        this.telefono= "";
    }

    /**
     * Constructor-2 for objects of class Duenho
     * 
     * @param  <nombre> de tipo String
     * @param  <direccion> de tipo String
     * @param  <telefono> de tipo String
    */
    public Duenho(String nombre, String direccion, String telefono)
    {
        this.nombre= nombre;
        this.direccion= direccion;
        this.telefono= telefono;
    }
    
    /**
     * Metodo setInfobasica
     * 
     * @param  <nombre> de tipo String
     * @param  <telefono> de tipo String
     * @return  void 
     */
    public void setInfobasica(String nombre, String telefono)
    {
        this.nombre= nombre;
        this.telefono= telefono;
    }
    
    /**
     * Metodo setNombre
     * 
     * @param  <nombre> de tipo String
     * @return  void 
     */
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
    /**
     * Metodo setDireccion
     * 
     * @param  <direccion> de tipo String
     * @return  void 
     */
    public void setDireccion(String direccion)
    {
        this.direccion= direccion;
    }
    
    /**
     * Metodo setTelefono
     * 
     * @param  <telefono> de tipo String
     * @return  void 
     */
    public void setTelefono(String telefono)
    {
        this.telefono= telefono;
    }
    
    //GETTERS
    
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
     * Metodo getDireccion
     * 
     * @return  String
     */
    public String getDireccion()
    {
        return this.direccion;
    }
    
    /**
     * Metodo getTelefono
     * 
     * @return  String
     */
    public String getTelefono()
    {
        return this.telefono;
    }
}