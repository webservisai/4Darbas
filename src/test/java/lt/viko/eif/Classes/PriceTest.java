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
public class PriceTest {
    
    public PriceTest() {
    }
    
    private Price instance;
    private DataBase dataBase = new DataBase();
    
    @Before
    public void setUp() {
        instance = new Price();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getPrice method, of class Price.
     */
    @org.junit.Test
    public void testGetPrice() throws Exception {
        System.out.println("getPrice");
        
    }
    
}
