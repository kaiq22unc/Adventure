package com.comp301.a02adventure;

public class PlayerImpl implements Player{

    private final String name;
    private Position p;
    private final Inventory inv;
    public PlayerImpl(String name, int startX, int startY){
        this.name = name;
        p = new PositionImpl(startX, startY);
        if(name == null){throw new IllegalArgumentException();}
        inv = new InventoryImpl();
    }

    public Position getPosition() {
        return p;
    }

    public Inventory getInventory() {
        return inv;
    }


    public String getName() {
        return name;
    }

    public void move(Direction direction){
        p = p.getNeighbor(direction);
    }


}
