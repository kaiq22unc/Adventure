package com.comp301.a02adventure;

public class ItemImpl implements Item{
    private final String name;
    public ItemImpl(String name){
        this.name = name;
        if(name == null){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false;}
        return obj.toString().equals(name);
    }

    @Override
    public String toString(){
        return name;
    }
}
