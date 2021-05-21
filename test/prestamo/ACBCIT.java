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
public class ACBCIT {
    private static Prestamo instance ;
    
    public ACBCIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance=new Prestamo();
    }
    
    @AfterClass
    public static void tearDownClass() {
        instance=null;
    }
    
    

    
    
}
