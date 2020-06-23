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
     * Test of getGrupo method, of class Det_Materia.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        Det_Materia instance = null;
        Grupo expResult = null;
        Grupo result = instance.getGrupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupo method, of class Det_Materia.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        Grupo grupo = null;
        Det_Materia instance = null;
        instance.setGrupo(grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorario method, of class Det_Materia.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Det_Materia instance = null;
        Horario expResult = null;
        Horario result = instance.getHorario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorario method, of class Det_Materia.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        Horario horario = null;
        Det_Materia instance = null;
        instance.setHorario(horario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
