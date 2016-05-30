
/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Barco
{
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora, int anoFab)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFab;
    }
    
    public int getAnoFabricacion()
    {
        return anoFabricacion;
    }
    
    /**
     * returns the registration tag
     */
    public String getMatricula()
    {
        return matricula;
    }
    
    /**
     * get the length
     */
    public float getEslora()
    {
        return eslora;
    }

    /**
     * returns an int with CoeficientedeBernua 
     */
    public abstract int getCoeficientedeBernua();
    
    /**
     * returns a String
     */
    public abstract String toString();
}

