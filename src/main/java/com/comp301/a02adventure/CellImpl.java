package com.comp301.a02adventure;

public class CellImpl implements Cell{

    private final Position p;
    private String name;
    private String description;
    private Inventory chest;
    private boolean flag;

    public CellImpl(int x, int y, String name, String description){
        this.flag = false;
        this.p = new PositionImpl(x,y);
        this.name = name;
        this.description = description;
        if(name == null || description == null){
            throw new IllegalArgumentException();
        }
    }

    public CellImpl(int x, int y){
        this.flag = false;
        this.p = new PositionImpl(x,y);
        this.name = "";
        this.description = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name == null){
            throw new IllegalArgumentException();
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        if(description == null){
            throw new IllegalArgumentException();
        }
    }

    public Position getPosition() {
        return p;
    }

    public Inventory getChest(){
        return chest;
    }

    public void setChest(Inventory inv){
        this.chest = inv;
        if(inv == null){
            throw new IllegalArgumentException();
        }
    }

    public boolean getIsVisited() {
        return flag;
    }

    public boolean hasChest() {
        return chest != null;
    }

    public void visit(){
        flag = true;
    }


}
