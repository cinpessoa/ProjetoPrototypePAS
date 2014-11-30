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
public class VacaTest {
    
    public VacaTest() {
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
     * Test of comer method, of class Vaca.
     */
    @Test
    public void testComer() {
        System.out.println("comer");
        Vaca instance = new Vaca();
        instance.comer();
    }

    /**
     * Test of andar method, of class Vaca.
     */
    @Test
    public void testAndar() {
        System.out.println("andar");
        Vaca instance = new Vaca();
        instance.andar();
    }

    /**
     * Test of clonar method, of class Vaca.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Vaca instance = new Vaca();
        Animal expResult = instance;
        Animal result = instance.clonar();
        assertEquals(expResult.getNome(), result.getNome());
    }

    /**
     * Test of toString method, of class Vaca.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vaca instance = new Vaca();
        String expResult = "A vaca null foi criada";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class Vaca.
     */
    

    /**
     * Test of setNome method, of class Vaca.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Vaca instance = new Vaca();
        instance.setNome(nome);
    }
    
}
