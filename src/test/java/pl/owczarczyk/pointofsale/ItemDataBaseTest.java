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
public class ItemDataBaseTest {
    
    public ItemDataBaseTest() {
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
     * Test of getItemByCode method, of class ItemDataBase.
     */
    @Test
    public void testGetItemByCode() {
        System.out.println("getItemByCode");
        int code = 0;
        ItemDataBase instance = new ItemDataBase();
        Item expResult = new Item(2.50f,"Milk");
        Item result = instance.getItemByCode(code);
        System.out.println(result.getName());
        assertEquals(expResult.getName(), result.getName());
    }
    
}
