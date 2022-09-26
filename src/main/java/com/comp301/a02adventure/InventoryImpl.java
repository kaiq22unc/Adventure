package com.comp301.a02adventure;

import java.util.ArrayList;
import java.util.List;


public class InventoryImpl implements Inventory{

    private final List<Item> l1;
    public InventoryImpl(){
        this.l1 = new ArrayList<Item>();
    }

    public boolean isEmpty(){
        for(Item item: l1){
            if(item != null){
                return false;
            }
        }
        return true;
    }

    public int getNumItems(){
        int num = 0;
        for(Item item: l1){
            if(item!=null){
                num++;
            }
        }
        return num;
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
        if(l1 != null){
            l1.clear();
        }
    }


    public void transferFrom(Inventory other){
        if(other != null){
            l1.addAll(other.getItems());
            other.clear();
            }
    }


}
