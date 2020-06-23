/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.estudiante.modelo;

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
public class Det_MateriaIT {
    
    public Det_MateriaIT() {
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
     * Test of getDet_id method, of class Det_Materia.
     */
    @Test
    public void testGetDet_id() {
        System.out.println("getDet_id");
        Det_Materia instance = null;
        int expResult = 0;
        int result = instance.getDet_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDet_id method, of class Det_Materia.
     */
    @Test
    public void testSetDet_id() {
        System.out.println("setDet_id");
        int det_id = 0;
        Det_Materia instance = null;
        instance.setDet_id(det_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDet_nivel method, of class Det_Materia.
     */
    @Test
    public void testGetDet_nivel() {
        System.out.println("getDet_nivel");
        Det_Materia instance = null;
        int expResult = 0;
        int result = instance.getDet_nivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDet_nivel method, of class Det_Materia.
     */
    @Test
    public void testSetDet_nivel() {
        System.out.println("setDet_nivel");
        int det_nivel = 0;
        Det_Materia instance = null;
        instance.setDet_nivel(det_nivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotas method, of class Det_Materia.
     */
    @Test
    public void testGetNotas() {
        System.out.println("getNotas");
        Det_Materia instance = null;
        Det_Notas expResult = null;
        Det_Notas result = instance.getNotas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotas method, of class Det_Materia.
     */
    @Test
    public void testSetNotas() {
        System.out.println("setNotas");
        Det_Notas notas = null;
        Det_Materia instance = null;
        instance.setNotas(notas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDet_estudiante method, of class Det_Materia.
     */
    @Test
    public void testGetDet_estudiante() {
        System.out.println("getDet_estudiante");
        Det_Materia instance = null;
        Det_Estudiante expResult = null;
        Det_Estudiante result = instance.getDet_estudiante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDet_estudiante method, of class Det_Materia.
     */
    @Test
    public void testSetDet_estudiante() {
        System.out.println("setDet_estudiante");
        Det_Estudiante det_estudiante = null;
        Det_Materia instance = null;
        instance.setDet_estudiante(det_estudiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecord method, of class Det_Materia.
     */
    @Test
    public void testGetRecord() {
        System.out.println("getRecord");
        Det_Materia instance = null;
        Recor_Academico expResult = null;
        Recor_Academico result = instance.getRecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecord method, of class Det_Materia.
     */
    @Test
    public void testSetRecord() {
        System.out.println("setRecord");
        Recor_Academico record = null;
        Det_Materia instance = null;
        instance.setRecord(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
