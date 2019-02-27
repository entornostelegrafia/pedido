/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ismael
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getserie method, of class Producto.
     */
    @Test
    public void testGetserie() {
        System.out.println("getserie");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getserie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getprecio method, of class Producto.
     */
    @Test
    public void testGetprecio() {
        System.out.println("getprecio");
        Producto instance = new Producto();
        double expResult = 0.0;
        double result = instance.getprecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nNombre = "";
        Producto instance = new Producto();
        instance.setNombre(nNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double nPrecio = 0.0;
        Producto instance = new Producto();
        instance.setPrecio(nPrecio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirNombre method, of class Producto.
     */
    @Test
    public void testPedirNombre() {
        System.out.println("pedirNombre");
        Producto instance = new Producto();
        instance.pedirNombre();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirPrecio method, of class Producto.
     */
    @Test
    public void testPedirPrecio() {
        System.out.println("pedirPrecio");
        Producto instance = new Producto();
        instance.pedirPrecio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resumen method, of class Producto.
     */
    @Test
    public void testResumen() {
        System.out.println("resumen");
        Producto instance = new Producto();
        instance.resumen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iguales method, of class Producto.
     */
    @Test
    public void testIguales() {
        System.out.println("iguales");
        Producto pargumento = null;
        Producto instance = new Producto();
        boolean expResult = false;
        boolean result = instance.iguales(pargumento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Producto.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Producto.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
