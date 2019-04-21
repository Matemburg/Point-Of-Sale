package pl.owczarczyk.pointofsale;

import java.util.ArrayList;

public class Printer {

    Receipt receipt;
    
    public Printer() {
    }
    
    public void printReceipt(ArrayList<Item> Items,float TotalPrice){

        try{
            String allItems="Receipt \n";
            for (Item i : Items)
            {
                allItems = allItems + i.getName() + " " + i.getPrice()+"\n";
            }
            allItems  = allItems + "Total: " + String.valueOf(TotalPrice);
            receipt =  new Receipt(allItems);
            receipt.setVisible(true);
           }
        catch(Exception e){
            String allItems="Receipt \n"; 
            allItems  = allItems + "Total: 0";
        }
        
    }
}
