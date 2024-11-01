

public class Pez extends Animal
{
    public String ambiente;
    
    /**
     * Constructor-1 for objects of class Pez
     */
    public Pez()
    {
        this.ambiente= "";
    }
    
    public Pez(String ambiente, String color, String nombre)
    {
        this.ambiente= ambiente;
        super.color= color;        
        super.nombre= nombre;
    }

    public Pez(String tipo, String raza, String nombre, String color, double peso, double tamanho, char genero, String ambiente)
    {
        this.ambiente= ambiente;
        super.color= color;        
        super.nombre= nombre;
        super.tipo= tipo;
        super.raza= raza;
        super.peso= peso;
        super.tamanho= tamanho;
        super.genero= genero;
    }
    /**
     * Metodo setPeso
     * 
     * @param  <peso> tipo double
     * @return  void 
     */
    public void setPeso(double peso)
    {
        if(peso > 0)
            super.peso= peso;
        
    }
}
