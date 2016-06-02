
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, float eslora, int anoFab, int potencia, int camarotes)
    {
      super(matricula, eslora, anoFab, potencia);
      this.camarotes = camarotes;
    }

    /**
     * returns an int with CoeficientedeBernua 
     */
    public int getCoeficientedeBernua()
    {
        return super.getCoeficientedeBernua()+ camarotes; 
    }
    
    /**
     * returns the specifications Yate
     */
    public String toString()
    {
        return "Matricula: " + getMatricula() + 
               "\nEslora: " + getEslora() +
               "\nAño Fabricación: " + getAnoFabricacion() +
               "\nPotencia: "+ super.getCoeficientedeBernua() +
               "\nCamarotes: "+ camarotes;
    }
}
