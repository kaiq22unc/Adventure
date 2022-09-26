package com.comp301.a02adventure;

import java.util.ArrayList;
import java.util.List;


public class InventoryImpl implements Inventory{

    private List<Item> l1;
    public InventoryImpl(){
        this.l1 = new ArrayList<Item>();
    }

    public boolean isEmpty(){
        return l1 == null;
    }

    public int getNumItems(){
        /*int num = 0;
        for (Item item : list) {
            if (item != null) {
                num++;
            }
        }
        return num;*/
        return l1.size();
    }

    public List<Item> getItems(){
        List<Item> nl1 = new ArrayList<Item>(l1);
        return nl1;
    }

    public void addItem(Item item){
        if(item != null){
            l1.add(item);
            }
    }

    public void removeItem(Item item){
        if(item != null){
            l1.remove(item);
        }
    }

    public void clear(){
        if(!l1.isEmpty()){
            l1.clear();
        }
    }


    public void transferFrom(Inventory other){
        if(!other.isEmpty()){
            l1.addAll(other.getItems());
            other.clear();
            }
    }


}
