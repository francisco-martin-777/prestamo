/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author duarte_martin
 */
public class ParamIT {
    
    public ParamIT() {
    }
    
   
    @RunWith(Parameterized.class)
public class paramIT {
    private int prestamo;
    private String resultadoEsperado;
    
    
    public paramIT(int prestamo,String resultadoEsperado) {
        this.prestamo=prestamo;
        this.resultadoEsperado=resultadoEsperado;
    }
    /**
     * ahora se generan los datos de prueba
     */
    @Parameterized.Parameters
	public static Iterable<Object> generarDatosTest() {
		List<Object> obj = new ArrayList<>();

		obj.add(new Object[] {500,"Préstamo no concedido carece de interes"  });
		obj.add(new Object[] {7000,"Felicidades, préstamo concedido"  });
		obj.add(new Object[] {20000,"Préstamo no concedido es una operación con demasiado riesgo" });
		obj.add(new Object[] {1000,"Felicidades, préstamo concedido" });
                obj.add(new Object[] {15000,"Felicidades, préstamo concedido" });
		return obj;
	}
        
        
    }
    

    /**
     * Test parametrizado
     */
    @Test
    public void testIntroducirPrestamo() {
        System.out.println("cadena correcta con el valor:"+prestamo+"con el resultado esperado:"+ resultadoEsperado);
        //String miCadena = "";  no la usaremos,se borra
        Prestamo instance = new Prestamo();
        //String expResult = ""; tampoco se usara, se borra
        String result = instance.prestamo(prestamo);
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    }
 
}
    
