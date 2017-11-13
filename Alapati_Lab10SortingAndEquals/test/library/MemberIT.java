/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Limit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class MemberIT {

    public MemberIT() {
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
     * Test of getAge method, of class Member.
     */
    @Test
    public void testGetAge() {
        Member instance = new Member("abc", 20) {};
        int expResult = 20;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Member.
     */
    @Test
    public void testSetAge() {
        int age = 0;
        Member instance = new Member("abc", 20) {};
        instance.setAge(age);
    }

    /**
     * Test of getItems method, of class Member.
     */
    @Test
    public void testGetItems() {
        Member instance = new Member("abc", 20) {};
        Item[] expResult = null;
        Item[] result = instance.getItems();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setItems method, of class Member.
     */
    @Test
    public void testSetItems() {
        Item[] items = null;
        Member instance = new Member("abc", 20) {};
        instance.setItems(items);
    }

    /**
     * Test of getMemberID method, of class Member.
     */
    @Test
    public void testGetMemberID() {
        Member instance = new Member("abc", 20) {};
        String expResult = "919637631";
        String result = instance.getMemberID();
        assertEquals(expResult, result);
    }

    /**
     * Test of generateMemberID method, of class Member.
     */
    @Test
    public void testGenerateMemberID() {
        Member instance = new Member("abc", 20) {};
        String expResult = "919639377";
        String result = instance.generateMemberID();
        assertEquals(expResult, result);
    }

    /**
     * Test of addItems method, of class Member.
     */
    @Test
    public void testAddItems() throws Exception {
        Item item = new Device("abc");
        Member instance = new Member("abc", 20) {};
        instance.setItems(new Item[Limit.FACULTY.getItemLimit()]);
        instance.addItems(item);
    }

    /**
     * Test of toString method, of class Member.
     */
    @Test
    public void testToString() {
        Member instance = new Member("abc", 20) {};
        String expResult = "MemberID: 919648107\n"
                + "Name: abc\n"
                + "Age: 20";
        instance.setItems(new Item[Limit.FACULTY.getItemLimit()]);
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Member.
     */
    @Test
    public void testCompareTo() {
        Member o = new Member("abc", 20) {};
        Member instance = new Member("abc", 20) {};
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

}
