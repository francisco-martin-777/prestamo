/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duarte_martin
 */
public class PrestamoTest {
    
    public PrestamoTest() {
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
     * Test of main method, of class Prestamo.
     */
   
    @Test
    public void testcaso1_1() {
        System.out.println("prestamo de una cantidad de dinero (valor numérico) si en importe es de 500.\n" +
"            la respuesta sera de : \"Préstamo no concedido carece de interes\"");
        int cantidad = 500;
        Prestamo instance = new Prestamo();
        String expResult = "Préstamo no concedido carece de interes";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testcaso1_2() {
        System.out.println("prestamo de una cantidad de dinero (valor numérico) si en importe es de 7000.\n" +
"             la respuesta sera de : \"Felicidades, préstamo concedido\"");
        int cantidad = 7000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testcaso1_3() {
        System.out.println("prestamo de una cantidad de dinero (valor numérico) si en importe es de 20000\n" +
"            la respuesta sera de : \"Préstamo no concedido es una operación con demasiado riesgo");
        int cantidad = 20000;
        Prestamo instance = new Prestamo();
        String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testcaso1_4() {
        System.out.println("prestamo de una cantidad de dinero (valor numérico) si en importe es de 1000.\n" +
"            la respuesta sera de :\"Felicidades, préstamo concedido\"\n" +
"");
        int cantidad = 1000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testcaso1_5() {
        System.out.println("prestamo de una cantidad de dinero (valor numérico) si en importe es de 1000.\n" +
"            la respuesta sera de :\"Felicidades, préstamo concedido" +
"");
        int cantidad = 15000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
