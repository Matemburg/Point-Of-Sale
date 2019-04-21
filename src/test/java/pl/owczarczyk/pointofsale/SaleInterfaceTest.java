package pl.owczarczyk.pointofsale;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SaleInterfaceTest {
    
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
        Item findItem = saleInterface.findItem(code);
        Item expResult = new Item(2.50f,"Milk");
        assertEquals(expResult,findItem);
    }
    
}
