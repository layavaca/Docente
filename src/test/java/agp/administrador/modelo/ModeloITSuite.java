/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.administrador.modelo;

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
@Suite.SuiteClasses({agp.administrador.modelo.CarreraIT.class, agp.administrador.modelo.MatriculaIT.class, agp.administrador.modelo.MateriaIT.class, agp.administrador.modelo.EstudianteIT.class, agp.administrador.modelo.DocenteIT.class, agp.administrador.modelo.HorarioIT.class, agp.administrador.modelo.PersonaIT.class, agp.administrador.modelo.GrupoIT.class})
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
