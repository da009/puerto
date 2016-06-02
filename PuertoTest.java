

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test001()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero("aaa", 12, 1990, 2);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva("bbb", 40, 2014, 1200);
        Yate yate1 = new Yate("ccc", 23, 2001, 4000, 8);
        Velero velero2 = new Velero("ddd", 5, 2016, 3);
        Cliente cliente1 = new Cliente("enrique", "55555k");
        Cliente cliente2 = new Cliente("kevin", "4444p");
        Cliente cliente3 = new Cliente("jose", "333l");
        Cliente cliente4 = new Cliente("dani", "6666h");
        Cliente cliente5 = new Cliente("miguel", "2222j");
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(4, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(5, cliente3, yate1));
        assertEquals(361600, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(27), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(7, cliente4, velero2));
    }
    
    @Test
    public void testmio()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero("vel", 8, 1950, 4);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva("dep", 8, 2005, 500);
        Yate yate1 = new Yate("yat", 30, 2010, 600, 10);
        Cliente cliente1 = new Cliente("Juan", "987654321E");
        Cliente cliente2 = new Cliente("Pepe", "987654321E");
        Cliente cliente3 = new Cliente("Paco", "789456123E");
        assertEquals(0, puerto1.addAlquiler(4, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(3, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(6, cliente3, yate1));
        assertEquals(1520.0, puerto1.liquidarAlquiler(0), 0.1);
        assertEquals(-1.0, puerto1.liquidarAlquiler(0), 0.1);
    }
}

