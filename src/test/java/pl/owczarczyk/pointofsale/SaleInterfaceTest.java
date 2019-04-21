/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.owczarczyk.pointofsale;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC-Home
 */
public class SaleInterfaceTest {
    
    public SaleInterfaceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class SaleInterface.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SaleInterface.main(args);
        
    }
    
    @Test
    private void testFindItem(){
        System.out.println("FindItem");
        int code=1;
        SaleInterface saleInterface = new SaleInterface();
        Item findItem = saleInterface.FindItem(code);
        Item expResult = new Item(2.50f,"Milk");
        assertEquals(expResult,findItem);
    }
    
}
