package com.comp301.a02adventure;

public class MapImpl implements Map{

    private Cell[][] grid;
    private int width;
    private int height;
    private int numItems;

    public MapImpl(int width, int height, int numItems){
        this.width = width;
        this.height = height;
        this.numItems = numItems;
        this.grid = new Cell[width][height];
        for(int i = 0;i < width;i++){
            for(int j = 0; j < height; j++){
                grid[i][j] = null;
            }
        }
        if(width <= 0 || height <= 0){
            throw new IllegalArgumentException();
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    public Cell getCell(Position position) {
        return grid[position.getX()][position.getY()];
    }

    public void initCell(int x, int y) {
        if(x>width || y>height){
            throw new IndexOutOfBoundsException();
        }else{
            grid[x][y] = new CellImpl(x,y);
        }
    }

    public int getNumItems() {
        return numItems;
    }
}
