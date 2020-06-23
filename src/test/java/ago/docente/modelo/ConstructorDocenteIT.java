/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ago.docente.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author domem
 */
public class ConstructorDocenteIT {
    
    public ConstructorDocenteIT() {
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
     * Test of crear method, of class ConstructorDocente.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Docentes datos = new Docentes(1,"0109876543","Maria","lija","lore@gmail.com","licenciado",2);
      //  ConstructorDocente instance = new ConstructorDocente();
       // instance.crear(datos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ConstructorDocente.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        System.out.println("crear");
        Docentes datos = new Docentes(1,"0109876543","Maria","lija","lore@gmail.com","licenciado",2);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ConstructorDocente.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
         System.out.println("crear");
        Docentes datos = new Docentes(1,"0109876543","Maria","lija","lore@gmail.com","licenciado",2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
