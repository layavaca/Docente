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
     * Test of getMateria method, of class Horario.
     */
    @Test
    public void testGetMateria() {
        System.out.println("getMateria");
        Horario instance = null;
        Materia expResult = null;
        Materia result = instance.getMateria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMateria method, of class Horario.
     */
    @Test
    public void testSetMateria() {
        System.out.println("setMateria");
        Materia materia = null;
        Horario instance = null;
        instance.setMateria(materia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class Horario.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        Horario instance = null;
        Grupo expResult = null;
        Grupo result = instance.getGrupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupo method, of class Horario.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        Grupo grupo = null;
        Horario instance = null;
        instance.setGrupo(grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarrera method, of class Horario.
     */
    @Test
    public void testGetCarrera() {
        System.out.println("getCarrera");
        Horario instance = null;
        Carrera expResult = null;
        Carrera result = instance.getCarrera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarrera method, of class Horario.
     */
    @Test
    public void testSetCarrera() {
        System.out.println("setCarrera");
        Carrera carrera = null;
        Horario instance = null;
        instance.setCarrera(carrera);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
