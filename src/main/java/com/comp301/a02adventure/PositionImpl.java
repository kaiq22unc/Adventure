package com.comp301.a02adventure;


public class PositionImpl implements Position{

    private final int x;
    private final int y;
    public PositionImpl(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public Position getNeighbor(Direction direction) {

        Position p = null;
        switch (direction) {
            case NORTH:
                p = new PositionImpl(x, y + 1);
                break;
            case SOUTH:
                p = new PositionImpl(x, y - 1);
                break;
            case EAST:
                p = new PositionImpl(x + 1, y);
                break;
            case WEST:
                p = new PositionImpl(x - 1, y);
                break;
        }
        return p;
    }
}
