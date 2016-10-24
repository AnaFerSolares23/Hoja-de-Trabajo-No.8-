/*  
* Ana Fernanda Solares, 13125
* Jose Rosales, 12576
*/

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MariaJose
 */
public class ClinicaTest {
    
    public ClinicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFirst method, of class Clinica.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Clinica instance = new Clinica();
        instance.getFirst();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Clinica.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Clinica instance = new Clinica();
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Clinica.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        E value = null;
        Clinica instance = new Clinica();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Clinica.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Clinica instance = new Clinica();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Clinica.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Clinica instance = new Clinica();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Clinica.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Clinica instance = new Clinica();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
