/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.administrador.controlador;

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
public class controladorGrupoIT {
    
    public controladorGrupoIT() {
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
     * Test of crearGrupo method, of class controladorGrupo.
     */
    @Test
    public void testCrearGrupo() {
        System.out.println("crearGrupo");
        controladorGrupo instance = new controladorGrupo();
        instance.crearGrupo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarGrupo method, of class controladorGrupo.
     */
    @Test
    public void testActualizarGrupo() {
        System.out.println("actualizarGrupo");
        controladorGrupo instance = new controladorGrupo();
        instance.actualizarGrupo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarGrupo method, of class controladorGrupo.
     */
    @Test
    public void testEliminarGrupo() {
        System.out.println("eliminarGrupo");
        controladorGrupo instance = new controladorGrupo();
        instance.eliminarGrupo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
