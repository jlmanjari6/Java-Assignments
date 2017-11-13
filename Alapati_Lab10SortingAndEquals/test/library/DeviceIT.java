/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

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
public class DeviceIT {
    
    public DeviceIT() {
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
     * Test of calculateFine method, of class Device.
     */
    @Test
    public void testCalculateFine() throws Exception {
        String dateTime1 = "12/30/2017 10:00:00";
        String dateTime2 = "12/30/2017 10:00:00";
        Device instance = new Device("abc");
        double expResult = 0.0;
        double result = instance.calculateFine(dateTime1, dateTime2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of generateUniqueID method, of class Device.
     */
    @Test
    public void testGenerateUniqueID() {
        Device instance = new Device("abc");
        String expResult = "NWM_D_2";
        String result = instance.generateUniqueID();
        assertEquals(expResult, result);
    }

    /**
     * Test of generateRackID method, of class Device.
     */
    @Test
    public void testGenerateRackID() {
        System.out.println("generateRackID");
        Device instance = new Device("abc");
        String expResult = "c_D_7";
        String result = instance.generateRackID();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Device.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Device instance = new Device("abc");
        String expResult = "Title: abc, Available: false, DeviceID: NWM_D_1, RackNo: c_D_7";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
