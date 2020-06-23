/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.docente.modelo;

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
public class Det_EstudianteIT {
    
    public Det_EstudianteIT() {
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
     * Test of getDet_id method, of class Det_Estudiante.
     */
    @Test
    public void testGetDet_id() {
        System.out.println("getDet_id");
        Det_Estudiante instance = null;
        int expResult = 0;
        int result = instance.getDet_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDet_id method, of class Det_Estudiante.
     */
    @Test
    public void testSetDet_id() {
        System.out.println("setDet_id");
        int det_id = 0;
        Det_Estudiante instance = null;
        instance.setDet_id(det_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarrera method, of class Det_Estudiante.
     */
    @Test
    public void testGetCarrera() {
        System.out.println("getCarrera");
        Det_Estudiante instance = null;
        Carrera expResult = null;
        Carrera result = instance.getCarrera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarrera method, of class Det_Estudiante.
     */
    @Test
    public void testSetCarrera() {
        System.out.println("setCarrera");
        Carrera carrera = null;
        Det_Estudiante instance = null;
        instance.setCarrera(carrera);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstudiante method, of class Det_Estudiante.
     */
    @Test
    public void testGetEstudiante() {
        System.out.println("getEstudiante");
        Det_Estudiante instance = null;
        Estudiante expResult = null;
        Estudiante result = instance.getEstudiante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstudiante method, of class Det_Estudiante.
     */
    @Test
    public void testSetEstudiante() {
        System.out.println("setEstudiante");
        Estudiante estudiante = null;
        Det_Estudiante instance = null;
        instance.setEstudiante(estudiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalleMateria method, of class Det_Estudiante.
     */
    @Test
    public void testGetDetalleMateria() {
        System.out.println("getDetalleMateria");
        Det_Estudiante instance = null;
        Det_Materia expResult = null;
        Det_Materia result = instance.getDetalleMateria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetalleMateria method, of class Det_Estudiante.
     */
    @Test
    public void testSetDetalleMateria() {
        System.out.println("setDetalleMateria");
        Det_Materia detalleMateria = null;
        Det_Estudiante instance = null;
        instance.setDetalleMateria(detalleMateria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
