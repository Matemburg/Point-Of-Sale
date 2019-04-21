/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.owczarczyk.pointofsale;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemDataBaseTest {
   
    @Test
    public void testGetItemByCode() {
        System.out.println("getItemByCode");
        int code = 0;
        ItemDataBase instance = new ItemDataBase();
        Item expResult = new Item(2.50f,"Milk");
        Item result = instance.getItemByCode(code);
        assertEquals(expResult.getName(), result.getName());
    }
    
    @Test
    public void testGetItemByCode2() {
        System.out.println("getItemByCode");
        int code = 0;
        ItemDataBase instance = new ItemDataBase();
        Item expResult = new Item(2.50f,"Milk");
        Item result = instance.getItemByCode(code);
        assertEquals(expResult.getPrice(), result.getPrice());
    }
    
    @Test
    public void testGetItemByCode3() {
        System.out.println("getItemByCode");
        int code = 0;
        ItemDataBase instance = new ItemDataBase();
        int expResult = 5;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }
    
}
