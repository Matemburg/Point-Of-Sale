/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.owczarczyk.pointofsale;

import javax.swing.JLabel;

/**
 *
 * @author PC-Home
 */
public class LCDDisplay {
     JLabel Display;

    public LCDDisplay(JLabel Display) {
       this.Display = Display;
    }
    
    public void ShowItem(Item item){
        String name = item.getName();
        String price = String.valueOf(item.getPrice());
        Display.setText(name + " " + price);
    }
    public void InvalidCodeMessage(){
        Display.setText("Product not found");
    }
    public void ItemNotFoundMessage(){
        Display.setText("Invalid bar-code");
    }
     public void ShowTotalPrice(float totalPrice){
        Display.setText(String.valueOf(totalPrice));
    }
}
