package pl.owczarczyk.pointofsale;

import java.util.ArrayList;


public class ItemDataBase {
    
    ArrayList<Item> itemDataBase = new ArrayList<>();

    public ItemDataBase() {
        itemDataBase.add(new Item(2.50f,"Milk"));
        itemDataBase.add(new Item(10.59f,"Butter"));
        itemDataBase.add(new Item(0.99f,"Snack"));
        itemDataBase.add(new Item(3.47f,"Ice Tea"));
        itemDataBase.add(new Item(6.30f,"Milk Shake"));
    }
    
    public Item getItemByCode(int code){
        return itemDataBase.get(code);  
    }
    
    public int getSize(){
        return itemDataBase.size();
    }
    
}
