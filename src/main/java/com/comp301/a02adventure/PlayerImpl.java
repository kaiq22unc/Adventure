package com.comp301.a02adventure;

public class PlayerImpl {

    private String name;
    private Position p;
    private Inventory inv;
    public PlayerImpl(String name, int startX, int startY){
        this.name = name;
        p = new PositionImpl(startX, startY);
        if(name == null){throw new IllegalArgumentException();}
    }

    public void move(Direction direction){
        p = p.getNeighbor(direction);
    }


}
