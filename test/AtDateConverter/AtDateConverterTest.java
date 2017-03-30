/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtDateConverter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amharb
 */
public class AtDateConverterTest {
    
    public AtDateConverterTest() {
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
     * Test of getAtDateBits method, of class AtDateConverter.
     */
    @Test
    public void testGetAtDateBits() {
        System.out.println("getAtDateBits");
        int year = 2017;
        int month = 2;
        int day = 28;
        int hour = 2;
        int min = 3;
        int sec = 55;
        String expResult = "@20170228020355";
        
        String result = AtDateConverter.getAtDateBits(year, month, day, hour, min, sec);

        System.out.println(result);

        assertEquals(expResult, result);


        // TODO review the generated test code and remove the default call to fail.

        //fail("The test case is a prototype.");
    }
    
}
