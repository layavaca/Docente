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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Monik
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({agp.docente.modelo.Det_MateriaIT.class, agp.docente.modelo.CarreraIT.class, agp.docente.modelo.Det_NotasIT.class, agp.docente.modelo.DocenteIT.class, agp.docente.modelo.HorarioIT.class, agp.docente.modelo.GrupoIT.class, agp.docente.modelo.NotasIT.class, agp.docente.modelo.EstudianteIT.class, agp.docente.modelo.MateriaIT.class, agp.docente.modelo.Det_EstudianteIT.class})
public class ModeloITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
