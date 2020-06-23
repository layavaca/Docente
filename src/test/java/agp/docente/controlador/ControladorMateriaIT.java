/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.docente.controlador;

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
public class ControladorMateriaIT {
    
    public ControladorMateriaIT() {
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
     * Test of listarNotas method, of class ControladorMateria.
     */
    @Test
    public void testListarNotas() {
        System.out.println("listarNotas");
        ControladorMateria instance = new ControladorMateria();
        instance.listarNotas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaHorario method, of class ControladorMateria.
     */
    @Test
    public void testListaHorario() {
        System.out.println("listaHorario");
        ControladorMateria instance = new ControladorMateria();
        instance.listaHorario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaGrupo method, of class ControladorMateria.
     */
    @Test
    public void testListaGrupo() {
        System.out.println("listaGrupo");
        ControladorMateria instance = new ControladorMateria();
        instance.listaGrupo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaHorariosGrupo method, of class ControladorMateria.
     */
    @Test
    public void testListaHorariosGrupo() {
        System.out.println("listaHorariosGrupo");
        ControladorMateria instance = new ControladorMateria();
        instance.listaHorariosGrupo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
