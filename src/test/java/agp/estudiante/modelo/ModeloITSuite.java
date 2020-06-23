/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.estudiante.modelo;

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
@Suite.SuiteClasses({agp.estudiante.modelo.Det_NotasIT.class, agp.estudiante.modelo.NotasIT.class, agp.estudiante.modelo.Det_MateriaIT.class, agp.estudiante.modelo.HorarioIT.class, agp.estudiante.modelo.EstudianteIT.class, agp.estudiante.modelo.Recor_AcademicoIT.class, agp.estudiante.modelo.GrupoIT.class, agp.estudiante.modelo.MateriaIT.class, agp.estudiante.modelo.CarreraIT.class, agp.estudiante.modelo.Det_EstudianteIT.class})
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
