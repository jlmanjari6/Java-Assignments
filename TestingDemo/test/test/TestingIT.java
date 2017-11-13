/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

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
public class TestingIT {
    
    public TestingIT() {
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
     * Test of getGrade method, of class Testing.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        int score = 60;
        Testing instance = new Testing();
        String expResult = "D";
        String result = instance.getGrade(score);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetGradeLowest() {
        System.out.println("getGrade lowest");
         Testing test = new Testing();
        assertEquals("A", test.getGrade(90));
        assertEquals("B", test.getGrade(80));
        assertEquals("C", test.getGrade(70));
        assertEquals("D", test.getGrade(60));
        assertEquals("F", test.getGrade(0));
        assertEquals("Error", test.getGrade(-1));
    }
    
    @Test
    public void testGetGradeHighest() {
        System.out.println("getGrade highest");
          Testing test = new Testing();
        assertEquals("B", test.getGrade(89));
        assertEquals("C", test.getGrade(79));
        assertEquals("D", test.getGrade(69));
        assertEquals("F", test.getGrade(59));
    }
@Test
    public void testGetGradeOutOfRange() {
        System.out.println("getGrade out of range");
          Testing test = new Testing();
        assertEquals("A", test.getGrade(101));
        assertEquals("A", test.getGrade(150));
        assertEquals("Error", test.getGrade(-1));
        assertEquals("Error", test.getGrade(-100));
        assertEquals("Error", test.getGrade(-140));
    }
    
    @Test
public void testGetGradeMiddle() {
        System.out.println("getGrade middle range");
        Testing test = new Testing();
        assertEquals("A", test.getGrade(94));
        assertEquals("B", test.getGrade(85));
        assertEquals("C", test.getGrade(75));
        assertEquals("D", test.getGrade(64));
        assertEquals("F", test.getGrade(30));
    }



    
}
