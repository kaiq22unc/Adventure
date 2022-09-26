package com.comp301.a02adventure;

public class CellImpl {

    private Position p;
    private String name;
    private String description;
    private Inventory chest;
    private boolean flag;

    public CellImpl(int x, int y, String name, String description){
        this.flag = false;
        Position p = new PositionImpl(x,y);
        this.name = name;
        this.description = description;
        if(name == null || description == null){
            throw new IllegalArgumentException();
        }
    }

    public CellImpl(int x, int y){
        this.flag = false;
        Position p = new PositionImpl(x,y);
        this.name = "";
        this.description = "";
    }

    public void setChest(Inventory inv){
        this.chest = inv;
    }

    public Inventory getChest(){
        return chest;
    }

    public void visit(){
        flag = true;
    }


}
