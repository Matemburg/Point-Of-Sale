package pl.owczarczyk.pointofsale;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class PrinterTest {
    
    @Test
    public void testPrintReceipt() {
        System.out.println("printReceipt");
        ArrayList<Item> Items = null;
        float TotalPrice = 0.0F;
        Printer instance = new Printer();
        instance.printReceipt(Items, TotalPrice); 
    }
}
