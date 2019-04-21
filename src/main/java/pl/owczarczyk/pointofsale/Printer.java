/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.owczarczyk.pointofsale;

import java.util.ArrayList;

/**
 *
 * @author PC-Home
 */
public class Printer {

    Receipt receipt;
    
    public Printer() {
    }
    
    public void printReceipt(ArrayList<Item> Items,float TotalPrice){
       
        String allItems="Receipt \n";
        for (Item i : Items)
        {
            allItems = allItems + i.getName() + " " + i.getPrice()+"\n";
        }
        allItems  = allItems + "Total: " + String.valueOf(TotalPrice);
        receipt =  new Receipt(allItems);
        receipt.setVisible(true);
        
        
    }
}
