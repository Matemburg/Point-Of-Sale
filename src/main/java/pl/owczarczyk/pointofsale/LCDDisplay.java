package pl.owczarczyk.pointofsale;

import javax.swing.JLabel;

public class LCDDisplay {
     JLabel Display;

    public LCDDisplay(JLabel Display) {
       this.Display = Display;
    }
    
    public void showItem(Item item){
        String name = item.getName();
        String price = String.valueOf(item.getPrice());
        Display.setText(name + " " + price);
    }
    public void invalidCodeMessage(){
        Display.setText("Product not found");
    }
    public void itemNotFoundMessage(){
        Display.setText("Invalid bar-code");
    }
     public void showTotalPrice(float totalPrice){
        Display.setText(String.valueOf(totalPrice));
    }
}
