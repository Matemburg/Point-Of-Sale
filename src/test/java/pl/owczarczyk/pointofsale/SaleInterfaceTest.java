package pl.owczarczyk.pointofsale;

import java.util.ArrayList;
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
    public void testFindItem(){
        System.out.println("findItem");
        int code=0;
        SaleInterface saleInterface = new SaleInterface();
        Item findItem = saleInterface.findItem(code);
        Item expResult = new Item(2.50f,"Milk");
        assertEquals(expResult.getName(),findItem.getName());
        assertEquals(expResult.getPrice(),findItem.getPrice());
    }
    
    @Test
    public void testAddAllPrices(){
        System.out.println("addAllPrices");
        
        ArrayList<Item> scanedItems  = new ArrayList<>();
        scanedItems.add(new Item(2.5f,"Milk"));
        scanedItems.add(new Item(5.5f,"Super Milk"));
        
        SaleInterface saleInterface = new SaleInterface();
        
        saleInterface.setScanedItems(scanedItems);
        
        float result = saleInterface.addAllPrices();
        
        float expResult = 8;
        assertEquals(expResult,result);
    }
    
    @Test
    public void testPrepereReceipt(){
        System.out.println("prepereReceipt");
        
        ArrayList<Item> scanedItems  = new ArrayList<>();
        scanedItems.add(new Item(2.5f,"Milk"));
        scanedItems.add(new Item(5.5f,"Super Milk"));
        
        SaleInterface saleInterface = new SaleInterface();
        
        saleInterface.setScanedItems(scanedItems);
        
        float totalPrice = saleInterface.addAllPrices();
        
        String result = saleInterface.prepereReceipt(totalPrice);
        
        String expResult = "Receipt \nMilk 2.5\nSuper Milk 5.5\nTotal: 8.0";
        assertEquals(expResult,result);
    }
    
    
}
