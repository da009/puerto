
/**
 * Write a description of class EmbarcaciónDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia, String matricula, float eslora, int anoFab)
    {
        super(matricula,eslora,anoFab);
        this.potencia = potencia;
    }

    /**
     * returns an int with CoeficientedeBernua
     */
    public int getCoeficientedeBernua()
    {
       return potencia; 
    }
    
    /**
     * returns the specifications EmbarcacionDeportiva
     */
    public String toString()
    {
        return "Matricula: "+ getMatricula() + "\nEslora: "+ getEslora() +"\nAño Fabricación: "
                + getAnoFabricacion() + "\nPotencia: "+ potencia;
    }
}
