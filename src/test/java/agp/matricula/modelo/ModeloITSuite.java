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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Monik
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({agp.matricula.modelo.CarreraIT.class, agp.matricula.modelo.BecaIT.class, agp.matricula.modelo.MatriculaIT.class, agp.matricula.modelo.MateriaIT.class, agp.matricula.modelo.EstudianteIT.class, agp.matricula.modelo.Det_PrematriculaIT.class, agp.matricula.modelo.PrematriculaIT.class, agp.matricula.modelo.GrupoIT.class, agp.matricula.modelo.HorarioIT.class})
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
