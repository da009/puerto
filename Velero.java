
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, float eslora, int anoFab, int numeroMastiles)
    {
        super(matricula, eslora, anoFab);
        this.numeroMastiles = numeroMastiles;
    }

    /**
     * returns an int with CoeficientedeBernua 
     */
    public int getCoeficientedeBernua()
    {
        return numeroMastiles;
    }
    
    /**
     * returns the specifications Velero
     */
    public String toString()
    {
        return "Matricula: "+ getMatricula() + "\nEslora: "+ getEslora() +"\nAño Fabricación: "
                + getAnoFabricacion() + "\nNumero de mastiles: "+ numeroMastiles;
    }
}
