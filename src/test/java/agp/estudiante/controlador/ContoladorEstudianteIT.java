/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.estudiante.controlador;

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
public class ContoladorEstudianteIT {
    
    public ContoladorEstudianteIT() {
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
     * Test of listaPersona method, of class ContoladorEstudiante.
     */
    @Test
    public void testListaPersona() {
        System.out.println("listaPersona");
        ContoladorEstudiante instance = new ContoladorEstudiante();
        instance.listaPersona();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaDet_Materia method, of class ContoladorEstudiante.
     */
    @Test
    public void testListaDet_Materia() {
        System.out.println("listaDet_Materia");
        ContoladorEstudiante instance = new ContoladorEstudiante();
        instance.listaDet_Materia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaRecor_Academico method, of class ContoladorEstudiante.
     */
    @Test
    public void testListaRecor_Academico() {
        System.out.println("listaRecor_Academico");
        ContoladorEstudiante instance = new ContoladorEstudiante();
        instance.listaRecor_Academico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
