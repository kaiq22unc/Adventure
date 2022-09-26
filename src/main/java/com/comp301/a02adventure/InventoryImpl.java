package com.comp301.a02adventure;

import java.util.ArrayList;
import java.util.List;


public class InventoryImpl implements Inventory{

    private List<Item> list;
    public InventoryImpl(){
        this.list = new ArrayList<Item>();
    }

    public boolean isEmpty(){
        boolean res = true;
        if(list != null){
            res = false;
        }else{
            res = false;
        }
        return res;
    }

    public int getNumItems(){
        int num = 0;
        for (Item item : list) {
            if (item != null) {
                num++;
            }
        }
        return num;
    }

    public List<Item> getItems(){
        List<Item> clone = new ArrayList<>(list);
        return clone;
    }

    public void addItem(Item item){
        list.add(item);
    }

    public void removeItem(Item item){
        list.remove(item);
    }

    public void clear(){
        list.clear();
    }

    public void transferFrom(Inventory other){
        list.addAll(other.getItems());
        other.clear();
    }


}
