import java.util.ArrayList;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private ArrayList<Alquiler> alquileres;
    private static final int NUMERO_AMARRES = 4;
    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<Alquiler>();
    }

    /**
     * add a rent to the Array, return the position or -1 if it's full
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {
        int count = 0;
        int posicion = 0;
        Alquiler compAlquiler = new Alquiler(0, null, null, -1);
        ArrayList<Alquiler> alquileresTemp = new ArrayList<Alquiler>();
        if(alquileres.size() != 4)
        {
            while(count < alquileres.size())
            {
                compAlquiler = alquileres.get(count);
                if(compAlquiler.getAmarre() != count)
                {
                    alquileresTemp.add(compAlquiler);
                    alquileres.remove(count);
                }
                else
                {
                    count++;
                    posicion = count;
                }
            }
            alquileres.add(new Alquiler(numeroDias, cliente, barco, posicion));
            for(Alquiler alquiler: alquileresTemp)
                alquileres.add(alquiler);
        }
        else
            posicion = -1;
        return posicion;
    }

    /**
     * print the empty places
     */
    public void verEstadoAmarres()
    {
        if (alquileres.size() > 0)
        {
            int cont = 0;
            int contador = 0;
            while (cont < NUMERO_AMARRES)
            {
                if (contador < alquileres.size() && alquileres.get(contador).getAmarre() == cont)
                {
                    System.out.println("Amarre " + (cont) + 
                        " Esta ocupado, el valor actual del alquiler es = " +
                        alquileres.get(contador).getCosteAlquiler());
                    cont++;
                    contador++;
                }
                else
                {
                    System.out.println("Amarre " + (cont) + " esta vacio");
                    cont++;
                }
            }
        }
        else
        {
            for(int cont = 0; cont < NUMERO_AMARRES; cont++)
                System.out.println("Amarre " + (cont) + " esta vacio");
        }
    }

    /**
     * Metodo que liquida un alquiler y devuelve su coste en float
     */
    public float liquidarAlquiler(int posicion)
    {    
        int cont = 0;
        boolean found = false;
        float liquidacion = 0;
        while(cont < alquileres.size() && !found){
            Alquiler compAlquiler = alquileres.get(cont);
            if (compAlquiler.getAmarre() == posicion){
                liquidacion = compAlquiler.getCosteAlquiler();
                alquileres.remove(cont);
                found = true;
            }
            cont++;
        }
        return liquidacion;
    }
}