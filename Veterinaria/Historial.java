/**
 * Historial class object.
 * 
 * @author (ese.joel) 
 * @version (V 0.01)
 */
public class Historial
{
    private String animal, fecha, diagnostico, tratamiento; 
    
    /**
     * Constructor-1 for objects of class historial
     */
    public Historial()
    {
        this.animal= "";
        this.fecha= "";
        this.diagnostico= "";
        this.tratamiento= "";
    }
    
    /**
     * Constructor-2 for objects of class Historial
     * 
     * @param  <Animal> de tipo String
     * @param  <fecha> de tipo String
     * @param  <diagnostico> de tipo String
     * @param  <tratamiento> de tipo String
    */
    public Historial(String animal, String fecha, String diagnostico, String tratamiento)
    {
        this.animal= animal;
        this.fecha= fecha;
        this.diagnostico= diagnostico;
        this.tratamiento= tratamiento; 
    }
    
    /**
     * Metodo setInfobasica
     * 
     * @param  <animal> de tipo String
     * @param  <fecha> de tipo String
     * @return  void 
     */
    public void setInfobasica(String animal, String fecha)
    {
        this.animal= animal;
        this.fecha= fecha;
    }

    /**
     * Metodo setAnimal
     * 
     * @param  <animal> de tipo String
     * @return  void 
     */
    public void setAnimal(String animal)
    {
        this.animal= animal;
    }
    
    /**
     * Metodo setFecha
     * 
     * @param  <fecha> de tipo String
     * @return  void 
     */
    public void setFecha(String fecha)
    {
        this.fecha= fecha;
    }
    
    /**
     * Metodo setDiagnostico
     * 
     * @param  <diagnostico> de tipo String
     * @return  void 
     */
    public void setDiagnostico(String diagnostico)
    {
        this.diagnostico= diagnostico;
    }
    
    /**
     * Metodo setTratamiento
     * 
     * @param  <tratamiento> de tipo String
     * @return  void 
     */
    public void setTratamiento(String tratamiento)
    {
        this.tratamiento= tratamiento;
    }
    
    //GETTERS
    
    /**
     * Metodo getAnimal
     * 
     * @return  String
     */
    public String getAnimal()
    {
        return this.animal;
    }
    
    /**
     * Metodo getFecha
     * 
     * @return  String
     */
    public String getFecha()
    {
        return this.fecha;
    }
    
    /**
     * Metodo getDiagnostico
     * 
     * @return  String
     */
    public String getDiagnostico()
    {
        return this.diagnostico;
    }
    
    /**
     * Metodo getTratamiento
     * 
     * @return  String
     */
    public String getTratamiento()
    {
        return this.tratamiento;
    }
}