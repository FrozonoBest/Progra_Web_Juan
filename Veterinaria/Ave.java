public class Ave extends Animal{ 
    public boolean volar;
    //public String volar
    /**
     *Constructor-1 for objects of class ave
     */
    public Ave()
    {
        this.volar= false;
    }

    /**
     * Metod setInfobasica para la informacion del ave
     * 
     * @param <volar> de tipo boolean
     * @param <color> de tipo String
     * @param <nombre> de tipo String
     */
    public Ave(boolean volar, String color, String nombre)
    {
        this.volar=volar;
        super.color=color;
        super.nombre=nombre;
    }

    public Ave(String tipo, String nombre, String color, String raza, char genero, double peso, double tamanho, boolean volar /*,String volar*/)
    {
        this.volar=volar;
        super.tipo=tipo;
        super.color=color;
        super.nombre=nombre;
        super.raza=raza;
        super.genero=genero;
        super.peso=peso;
        super.tamanho=tamanho;
    }

    /**
     * Metodo setVolar
     * 
     * @param  <volar> tipo boolaen
     */
    public void setVolar(boolean volar/* String volar */)
    {
        this.volar=volar;
    }

    /**
     * Metodo getVolar
     * 
     * return boolean
     */
    public boolean getVolar/* String getVolar*/()
    {
        return this.volar;
    }
}