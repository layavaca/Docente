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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Monik
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({agp.administrador.controlador.controladorGrupoIT.class, agp.administrador.controlador.controladorHorarioIT.class, agp.administrador.controlador.controladorCarreraIT.class, agp.administrador.controlador.controladorMateriaIT.class, agp.administrador.controlador.controladorEstudianteIT.class, agp.administrador.controlador.controladorDocenteIT.class, agp.administrador.controlador.controladorMatriculaIT.class})
public class ControladorITSuite {

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
