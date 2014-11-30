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
public class CachorroTest {
    
    public CachorroTest() {
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
     * Test of comer method, of class Cachorro.
     */
    @Test
    public void testComer() {
        System.out.println("comer");
        Cachorro instance = new Cachorro();
        instance.comer();
    }

    /**
     * Test of andar method, of class Cachorro.
     */
    @Test
    public void testAndar() {
        System.out.println("andar");
        Cachorro instance = new Cachorro();
        instance.andar();
    }

    /**
     * Test of clonar method, of class Cachorro.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Cachorro instance = new Cachorro();
        Animal expResult = instance;
        Animal result = instance.clonar();
        assertEquals(expResult.getNome(), result.getNome());
    }

    /**
     * Test of toString method, of class Cachorro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cachorro instance = new Cachorro();
        String expResult = "O cachorro null foi criado";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class Cachorro.
     */
    

    /**
     * Test of setNome method, of class Cachorro.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Cachorro instance = new Cachorro();
        instance.setNome(nome);
    }
    
}
