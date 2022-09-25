package com.comp301.a02adventure;

import jdk.internal.net.http.common.Pair;

public class PositionImpl implements Position{

    private int x;
    private int y;
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
        int nx = 0;
        int ny = 0;
        Position p = new PositionImpl(nx, ny);
        switch(direction){
            case NORTH:
                nx = x;
                ny = y + 1;
                break;
            case SOUTH:
                nx = x;
                ny = y - 1;
                break;
            case EAST:
                nx = x + 1;
                ny = y;
                break;
            case WEST:
                nx = x - 1;
                ny = y;
                break;
        }
        return p;
    }
}
