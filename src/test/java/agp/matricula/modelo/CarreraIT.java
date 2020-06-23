/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.matricula.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Monik
 */
public class CarreraIT {
    
    public CarreraIT() {
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
     * Test of getCar_id method, of class Carrera.
     */
    @Test
    public void testGetCar_id() {
        System.out.println("getCar_id");
        Carrera instance = null;
        int expResult = 0;
        int result = instance.getCar_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCar_id method, of class Carrera.
     */
    @Test
    public void testSetCar_id() {
        System.out.println("setCar_id");
        int car_id = 0;
        Carrera instance = null;
        instance.setCar_id(car_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCar_nombre method, of class Carrera.
     */
    @Test
    public void testGetCar_nombre() {
        System.out.println("getCar_nombre");
        Carrera instance = null;
        String expResult = "";
        String result = instance.getCar_nombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCar_nombre method, of class Carrera.
     */
    @Test
    public void testSetCar_nombre() {
        System.out.println("setCar_nombre");
        String car_nombre = "";
        Carrera instance = null;
        instance.setCar_nombre(car_nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCar_modallidad method, of class Carrera.
     */
    @Test
    public void testGetCar_modallidad() {
        System.out.println("getCar_modallidad");
        Carrera instance = null;
        String expResult = "";
        String result = instance.getCar_modallidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCar_modallidad method, of class Carrera.
     */
    @Test
    public void testSetCar_modallidad() {
        System.out.println("setCar_modallidad");
        String car_modallidad = "";
        Carrera instance = null;
        instance.setCar_modallidad(car_modallidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
