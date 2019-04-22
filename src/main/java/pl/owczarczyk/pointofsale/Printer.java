package pl.owczarczyk.pointofsale;

import java.util.ArrayList;

public class Printer {

    private Receipt receipt;
    
    public Printer() {
    }
    
    public void print(String allItems){
        receipt = new Receipt(allItems);
        receipt.setVisible(true);
    }
    
     
}
