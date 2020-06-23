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
public class ControladorNotasIT {
    
    public ControladorNotasIT() {
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
     * Test of listarNotas method, of class ControladorNotas.
     */
    @Test
    public void testListarNotas() {
        System.out.println("listarNotas");
        ControladorNotas instance = new ControladorNotas();
        instance.listarNotas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaMateria method, of class ControladorNotas.
     */
    @Test
    public void testListaMateria() {
        System.out.println("listaMateria");
        ControladorNotas instance = new ControladorNotas();
        instance.listaMateria();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaNotaMateria method, of class ControladorNotas.
     */
    @Test
    public void testListaNotaMateria() {
        System.out.println("listaNotaMateria");
        ControladorNotas instance = new ControladorNotas();
        instance.listaNotaMateria();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPromedio method, of class ControladorNotas.
     */
    @Test
    public void testCalcularPromedio() {
        System.out.println("calcularPromedio");
        ControladorNotas instance = new ControladorNotas();
        instance.calcularPromedio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
