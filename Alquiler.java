
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    public static final int VALOR_FIJO_ALQUILER = 300;
    public static final int MULTIPLICADOR_ESLORA = 10;
    private int amarre;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dia, Cliente cliente, Barco barco, int amarre)
    {
        this.numeroDias = dia;
        this.cliente = cliente;
        this.barco = barco;
        this.amarre = amarre;
    }

    /**
     * returns a float with te cost for rent the boat
     */
    public float getCosteAlquiler()
    {
        return numeroDias*(barco.getEslora()*MULTIPLICADOR_ESLORA) + (VALOR_FIJO_ALQUILER*barco.getCoeficientedeBernua());
    }
    
    /**
     * Devuelve un int del amarre
     */
    public int getAmarre()
    {
        return amarre;
    }
    
    /**
     * returns a String with the number of days of the rent, the client and the boat
     */
    public String toString()
    {
        return "Number of days: " + numeroDias + "\nClient: " + cliente + "\nBoat: " + barco;
    }
}
