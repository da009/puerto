
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * returns the name
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * returns the DNI
     */
    public String getDNI()
    {
        return dni;
    }
    
    /**
     * returns a String with name and the DNI
     */
    public String toString()
    {
        return "Name: " + nombre + "\nDNI: " + dni;
    }
}
