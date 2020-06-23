/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.matricula.modelo;

import javax.xml.crypto.Data;
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
public class PrematriculaIT {
    
    public PrematriculaIT() {
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
     * Test of getPre_id method, of class Prematricula.
     */
    @Test
    public void testGetPre_id() {
        System.out.println("getPre_id");
        Prematricula instance = null;
        int expResult = 0;
        int result = instance.getPre_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_id method, of class Prematricula.
     */
    @Test
    public void testSetPre_id() {
        System.out.println("setPre_id");
        int pre_id = 0;
        Prematricula instance = null;
        instance.setPre_id(pre_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_fech method, of class Prematricula.
     */
    @Test
    public void testGetPre_fech() {
        System.out.println("getPre_fech");
        Prematricula instance = null;
        Data expResult = null;
        Data result = instance.getPre_fech();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_fech method, of class Prematricula.
     */
    @Test
    public void testSetPre_fech() {
        System.out.println("setPre_fech");
        Data pre_fech = null;
        Prematricula instance = null;
        instance.setPre_fech(pre_fech);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_valor_neto method, of class Prematricula.
     */
    @Test
    public void testGetPre_valor_neto() {
        System.out.println("getPre_valor_neto");
        Prematricula instance = null;
        double expResult = 0.0;
        double result = instance.getPre_valor_neto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_valor_neto method, of class Prematricula.
     */
    @Test
    public void testSetPre_valor_neto() {
        System.out.println("setPre_valor_neto");
        double pre_valor_neto = 0.0;
        Prematricula instance = null;
        instance.setPre_valor_neto(pre_valor_neto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_descuento method, of class Prematricula.
     */
    @Test
    public void testGetPre_descuento() {
        System.out.println("getPre_descuento");
        Prematricula instance = null;
        double expResult = 0.0;
        double result = instance.getPre_descuento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_descuento method, of class Prematricula.
     */
    @Test
    public void testSetPre_descuento() {
        System.out.println("setPre_descuento");
        double pre_descuento = 0.0;
        Prematricula instance = null;
        instance.setPre_descuento(pre_descuento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_subtotal method, of class Prematricula.
     */
    @Test
    public void testGetPre_subtotal() {
        System.out.println("getPre_subtotal");
        Prematricula instance = null;
        double expResult = 0.0;
        double result = instance.getPre_subtotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_subtotal method, of class Prematricula.
     */
    @Test
    public void testSetPre_subtotal() {
        System.out.println("setPre_subtotal");
        double pre_subtotal = 0.0;
        Prematricula instance = null;
        instance.setPre_subtotal(pre_subtotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_IVA method, of class Prematricula.
     */
    @Test
    public void testGetPre_IVA() {
        System.out.println("getPre_IVA");
        Prematricula instance = null;
        double expResult = 0.0;
        double result = instance.getPre_IVA();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_IVA method, of class Prematricula.
     */
    @Test
    public void testSetPre_IVA() {
        System.out.println("setPre_IVA");
        double pre_IVA = 0.0;
        Prematricula instance = null;
        instance.setPre_IVA(pre_IVA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_total method, of class Prematricula.
     */
    @Test
    public void testGetPre_total() {
        System.out.println("getPre_total");
        Prematricula instance = null;
        double expResult = 0.0;
        double result = instance.getPre_total();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_total method, of class Prematricula.
     */
    @Test
    public void testSetPre_total() {
        System.out.println("setPre_total");
        double pre_total = 0.0;
        Prematricula instance = null;
        instance.setPre_total(pre_total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_tipo_pago method, of class Prematricula.
     */
    @Test
    public void testGetPre_tipo_pago() {
        System.out.println("getPre_tipo_pago");
        Prematricula instance = null;
        String expResult = "";
        String result = instance.getPre_tipo_pago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_tipo_pago method, of class Prematricula.
     */
    @Test
    public void testSetPre_tipo_pago() {
        System.out.println("setPre_tipo_pago");
        String pre_tipo_pago = "";
        Prematricula instance = null;
        instance.setPre_tipo_pago(pre_tipo_pago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_detalle method, of class Prematricula.
     */
    @Test
    public void testGetPre_detalle() {
        System.out.println("getPre_detalle");
        Prematricula instance = null;
        Det_Prematricula expResult = null;
        Det_Prematricula result = instance.getPre_detalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_detalle method, of class Prematricula.
     */
    @Test
    public void testSetPre_detalle() {
        System.out.println("setPre_detalle");
        Det_Prematricula pre_detalle = null;
        Prematricula instance = null;
        instance.setPre_detalle(pre_detalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre_inscripcion method, of class Prematricula.
     */
    @Test
    public void testGetPre_inscripcion() {
        System.out.println("getPre_inscripcion");
        Prematricula instance = null;
        Matricula expResult = null;
        Matricula result = instance.getPre_inscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPre_inscripcion method, of class Prematricula.
     */
    @Test
    public void testSetPre_inscripcion() {
        System.out.println("setPre_inscripcion");
        Matricula pre_inscripcion = null;
        Prematricula instance = null;
        instance.setPre_inscripcion(pre_inscripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
