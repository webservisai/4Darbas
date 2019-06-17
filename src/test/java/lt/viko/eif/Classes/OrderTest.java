/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.Classes;

import lt.viko.eif.DataBase.DataBase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Zalman
 */
public class OrderTest {
    
    public OrderTest() {
    }
    
    private Order instance;
    private DataBase dataBase = new DataBase();
    
    @Before
    public void setUp() {
        instance = new Order();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of setPrice method, of class Order.
     */
    @org.junit.Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Order instance = new Order();
        
        instance.setPrice(10.2);
        assertEquals(10.2, instance.getPrice(), 0);
    }

    /**
     * Test of setDistance method, of class Order.
     */
    @org.junit.Test
    public void testSetDistance() {
        System.out.println("setDistance");
        Order instance = new Order();
        
        instance.setDistance(10.2);
        assertEquals(10.2, instance.getDistance(), 0);
    }

    /**
     * Test of setWeight method, of class Order.
     */
    @org.junit.Test
    public void testSetWeight() {
        System.out.println("setWeight");
        Order instance = new Order();
        
        instance.setWeight(10.2);
        assertEquals(10.2, instance.getWeight(), 0);
    }

    /**
     * Test of setStartLocation method, of class Order.
     */
    @org.junit.Test
    public void testSetStartLocation() {
        System.out.println("setStartLocation");
        Order instance = new Order();
        
        instance.setStartLocation("pradzia");
        assertEquals("pradzia", instance.getStartLocation());
    }

    /**
     * Test of setEndLocation method, of class Order.
     */
    @org.junit.Test
    public void testSetEndLocation() {
        System.out.println("setEndLocation");
        Order instance = new Order();
        
        instance.setEndLocation("pabaiga");
        assertEquals("pabaiga", instance.getEndLocation());
    }

    /**
     * Test of getPrice method, of class Order.
     */
    @org.junit.Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Order instance = new Order();
        
        instance.setPrice(10.2);
        assertEquals(10.2, instance.getPrice(), 0);
    }

    /**
     * Test of getDistance method, of class Order.
     */
    @org.junit.Test
    public void testGetDistance() {
        System.out.println("setDistance");
        Order instance = new Order();
        
        instance.setDistance(10.2);
        assertEquals(10.2, instance.getDistance(), 0);
    }

    /**
     * Test of getWeight method, of class Order.
     */
    @org.junit.Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Order instance = new Order();
        
        instance.setWeight(10.2);
        assertEquals(10.2, instance.getWeight(), 0);
    }

    /**
     * Test of getStartLocation method, of class Order.
     */
    @org.junit.Test
    public void testGetStartLocation() {
        System.out.println("getStartLocation");
        Order instance = new Order();
        
        instance.setStartLocation("pradzia");
        assertEquals("pradzia", instance.getStartLocation());
    }

    /**
     * Test of getEndLocation method, of class Order.
     */
    @org.junit.Test
    public void testGetEndLocation() {
        System.out.println("getEndLocation");
        Order instance = new Order();
        
        instance.setEndLocation("pabaiga");
        assertEquals("pabaiga", instance.getEndLocation());
    }
    
}
