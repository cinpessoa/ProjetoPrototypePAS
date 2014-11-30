/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animais.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CINTHIA
 */
public class GatoTest {
    
    public GatoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando....");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando....");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of comer method, of class Gato.
     */
    @Test
    public void testComer() {
        System.out.println("comer");
        Gato instance = new Gato();
        instance.comer();
    }

    /**
     * Test of andar method, of class Gato.
     */
    @Test
    public void testAndar() {
        System.out.println("andar");
        Gato instance = new Gato();
        instance.andar();
    }

    /**
     * Test of clonar method, of class Gato.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Gato instance = new Gato();
        Animal expResult = instance;
        Animal result = instance.clonar();
        assertEquals(expResult.getNome(), result.getNome());
    }

    /**
     * Test of toString method, of class Gato.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Gato instance = new Gato();
        String expResult = "O gato null foi criado";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class Gato.
     */
    

    /**
     * Test of setNome method, of class Gato.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Gato instance = new Gato();
        instance.setNome(nome);
    }
    
}
