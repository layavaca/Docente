/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.matricula.modelo;

import java.util.Date;
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
public class MatriculaIT {
    
    public MatriculaIT() {
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
     * Test of getIns_id method, of class Matricula.
     */
    @Test
    public void testGetIns_id() {
        System.out.println("getIns_id");
        Matricula instance = null;
        int expResult = 0;
        int result = instance.getIns_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIns_id method, of class Matricula.
     */
    @Test
    public void testSetIns_id() {
        System.out.println("setIns_id");
        int ins_id = 0;
        Matricula instance = null;
        instance.setIns_id(ins_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIns_fecha method, of class Matricula.
     */
    @Test
    public void testGetIns_fecha() {
        System.out.println("getIns_fecha");
        Matricula instance = null;
        Date expResult = null;
        Date result = instance.getIns_fecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIns_fecha method, of class Matricula.
     */
    @Test
    public void testSetIns_fecha() {
        System.out.println("setIns_fecha");
        Date ins_fecha = null;
        Matricula instance = null;
        instance.setIns_fecha(ins_fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIns_hora method, of class Matricula.
     */
    @Test
    public void testGetIns_hora() {
        System.out.println("getIns_hora");
        Matricula instance = null;
        String expResult = "";
        String result = instance.getIns_hora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIns_hora method, of class Matricula.
     */
    @Test
    public void testSetIns_hora() {
        System.out.println("setIns_hora");
        String ins_hora = "";
        Matricula instance = null;
        instance.setIns_hora(ins_hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIns_estudiantes method, of class Matricula.
     */
    @Test
    public void testGetIns_estudiantes() {
        System.out.println("getIns_estudiantes");
        Matricula instance = null;
        Estudiante expResult = null;
        Estudiante result = instance.getIns_estudiantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIns_estudiantes method, of class Matricula.
     */
    @Test
    public void testSetIns_estudiantes() {
        System.out.println("setIns_estudiantes");
        Estudiante ins_estudiantes = null;
        Matricula instance = null;
        instance.setIns_estudiantes(ins_estudiantes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIns_carrera method, of class Matricula.
     */
    @Test
    public void testGetIns_carrera() {
        System.out.println("getIns_carrera");
        Matricula instance = null;
        Carrera expResult = null;
        Carrera result = instance.getIns_carrera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIns_carrera method, of class Matricula.
     */
    @Test
    public void testSetIns_carrera() {
        System.out.println("setIns_carrera");
        Carrera ins_carrera = null;
        Matricula instance = null;
        instance.setIns_carrera(ins_carrera);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDescuento method, of class Matricula.
     */
    @Test
    public void testCalcularDescuento() {
        System.out.println("calcularDescuento");
        Matricula instance = null;
        instance.calcularDescuento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
