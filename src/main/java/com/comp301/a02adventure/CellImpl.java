package com.comp301.a02adventure;

public class CellImpl implements Cell{

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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Position getPosition() {
        return p;
    }

    public Inventory getChest(){
        return chest;
    }

    public boolean getIsVisited() {
        return flag;
    }

    public boolean hasChest() {
        return chest != null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void visit(){
        flag = true;
    }


}
