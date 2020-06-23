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
public class HorarioIT {
    
    public HorarioIT() {
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
     * Test of getHor_id method, of class Horario.
     */
    @Test
    public void testGetHor_id() {
        System.out.println("getHor_id");
        Horario instance = null;
        int expResult = 0;
        int result = instance.getHor_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHor_id method, of class Horario.
     */
    @Test
    public void testSetHor_id() {
        System.out.println("setHor_id");
        int hor_id = 0;
        Horario instance = null;
        instance.setHor_id(hor_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHor_dias method, of class Horario.
     */
    @Test
    public void testGetHor_dias() {
        System.out.println("getHor_dias");
        Horario instance = null;
        String expResult = "";
        String result = instance.getHor_dias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHor_dias method, of class Horario.
     */
    @Test
    public void testSetHor_dias() {
        System.out.println("setHor_dias");
        String hor_dias = "";
        Horario instance = null;
        instance.setHor_dias(hor_dias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHor_hora method, of class Horario.
     */
    @Test
    public void testGetHor_hora() {
        System.out.println("getHor_hora");
        Horario instance = null;
        String expResult = "";
        String result = instance.getHor_hora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHor_hora method, of class Horario.
     */
    @Test
    public void testSetHor_hora() {
        System.out.println("setHor_hora");
        String hor_hora = "";
        Horario instance = null;
        instance.setHor_hora(hor_hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHor_grupo method, of class Horario.
     */
    @Test
    public void testGetHor_grupo() {
        System.out.println("getHor_grupo");
        Horario instance = null;
        Grupo expResult = null;
        Grupo result = instance.getHor_grupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHor_grupo method, of class Horario.
     */
    @Test
    public void testSetHor_grupo() {
        System.out.println("setHor_grupo");
        Grupo hor_grupo = null;
        Horario instance = null;
        instance.setHor_grupo(hor_grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHor_materia method, of class Horario.
     */
    @Test
    public void testGetHor_materia() {
        System.out.println("getHor_materia");
        Horario instance = null;
        Materia expResult = null;
        Materia result = instance.getHor_materia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHor_materia method, of class Horario.
     */
    @Test
    public void testSetHor_materia() {
        System.out.println("setHor_materia");
        Materia hor_materia = null;
        Horario instance = null;
        instance.setHor_materia(hor_materia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHor_carrera method, of class Horario.
     */
    @Test
    public void testGetHor_carrera() {
        System.out.println("getHor_carrera");
        Horario instance = null;
        Carrera expResult = null;
        Carrera result = instance.getHor_carrera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHor_carrera method, of class Horario.
     */
    @Test
    public void testSetHor_carrera() {
        System.out.println("setHor_carrera");
        Carrera hor_carrera = null;
        Horario instance = null;
        instance.setHor_carrera(hor_carrera);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
