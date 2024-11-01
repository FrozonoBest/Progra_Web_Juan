/**
 * Medicamentos class objet.
 * 
 * @author (ese.joel) 
 * @version (V 0.01) 
 */
public class Medicamento
{
    private String nombre, prinAct, concentracion, presentacion, fab, exp, tipo;
    private double precio;

    /**
     * Constructor-1 for objects of class Medicamento
     */
    public Medicamento()
    {
        this.nombre= "";
        this.prinAct= "";
        this.concentracion= "";
        this.presentacion= "";
        this.tipo= "";
        this.fab= "";
        this.exp= "";
        this.precio= 0;
    }

    /**
     * Constructor-2 for objects of class Medicamento
     */
    public Medicamento(String nombre, String prinAct, String concentracion, String presentacion, String fab, String exp, double precio)
    {
        this.nombre= nombre;
        this.prinAct= prinAct;
        this.concentracion= concentracion;
        this.presentacion= presentacion;
        this.fab= fab;
        this.exp= exp;
        this.precio= 0;
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
     * Metodo setprinAct
     * 
     * @param  <prinAct> de tipo String
     * @return  void 
     */
    public void setCodigo(String prinAct)
    {
        this.prinAct= prinAct;
    }
    
    /**
     * Metodo setConcentracion
     * 
     * @param  <concentracion> de tipo String
     * @return  void 
     */
    public void setConcentracione(String concentracion)
    {
        this.concentracion= concentracion;
    }
    
    /**
     * Metodo setPresentacion
     * 
     * @param  <presentacion> de tipo String
     * @return  void 
     */
    public void setPresentacion(String presentacion)
    {
        this.presentacion= presentacion;
    }
    
    /**
     * Metodo setFab
     * 
     * @param  <fab> de tipo String
     * @return  void 
     */
    public void setFab(String fab)
    {
        this.fab= fab;
    }
    
    /**
     * Metodo setExp
     * 
     * @param  <exp> de tipo String
     * @return  void 
     */
    public void setExp(String exp)
    {
        this.exp= exp;
    }
    
    /**
     * Metodo setPrecio
     * 
     * @param  <precio> de tipo double
     * @return  void 
     */
    public void setPrecio(double precio)
    {
        this.precio= precio;
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
     * Metodo getprinAct
     * 
     * @return  String
     */
    public String getPrinAct()
    {
        return this.prinAct;
    }
    
    /**
     * Metodo getConcentracion
     * 
     * @return  String
     */
    public String getConcentracion()
    {
        return this.concentracion;
    }
    
    /**
     * Metodo getPresentacion
     * 
     * @return  String
     */
    public String getPresentacion()
    {
        return this.presentacion;
    }
    
    /**
     * Metodo getFab
     * 
     * @return  String
     */
    public String getFab()
    {
        return this.fab;
    }
    
    /**
     * Metodo getExp
     * 
     * @return  String
     */
    public String getExp()
    {
        return this.exp;
    }
    
    /**
     * Metodo getPrecio
     * 
     * @return  double
     */
    public double getPrecio()
    {
        return this.precio;
    }
}