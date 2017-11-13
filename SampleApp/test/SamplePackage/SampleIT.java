/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SamplePackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S530719
 */
public class SampleIT {
    
    public SampleIT() {
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
     * Test of getBookId method, of class Sample.
     */
    @Test
    public void testGetBookId() {
        System.out.println("getBookId");
        Sample instance = null;
        int expResult = 0;
        int result = instance.getBookId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookName method, of class Sample.
     */
    @Test
    public void testGetBookName() {
        System.out.println("getBookName");
        Sample instance = null;
        String expResult = "";
        String result = instance.getBookName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookAuthor method, of class Sample.
     */
    @Test
    public void testGetBookAuthor() {
        System.out.println("getBookAuthor");
        Sample instance = null;
        String expResult = "";
        String result = instance.getBookAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBookId method, of class Sample.
     */
    @Test
    public void testSetBookId() {
        System.out.println("setBookId");
        int id = 0;
        Sample instance = null;
        instance.setBookId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBookName method, of class Sample.
     */
    @Test
    public void testSetBookName() {
        System.out.println("setBookName");
        String name = "";
        Sample instance = null;
        instance.setBookName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBookAuthor method, of class Sample.
     */
    @Test
    public void testSetBookAuthor() {
        System.out.println("setBookAuthor");
        String author = "";
        Sample instance = null;
        instance.setBookAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Sample.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sample instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
