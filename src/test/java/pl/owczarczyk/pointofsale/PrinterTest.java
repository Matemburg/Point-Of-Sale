package pl.owczarczyk.pointofsale;

import org.junit.jupiter.api.Test;

public class PrinterTest {

    @Test
    public void testPrint() {
        System.out.println("print");
        String allItems = "";
        Printer instance = new Printer();
        instance.print(allItems);
    }
    
}
