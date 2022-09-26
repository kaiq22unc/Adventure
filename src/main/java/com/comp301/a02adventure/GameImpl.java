package com.comp301.a02adventure;

import java.util.List;

public class GameImpl implements Game{

    private Map map;
    private Player player;

    public GameImpl(Map map, Player player) {
        this.map = map;
        this.player = player;
        if(map == null || player == null){
            throw new IllegalArgumentException();
        }
    }

    public Position getPlayerPosition() {
        return player.getPosition();
    }

    public String getPlayerName() {
        return player.getName();
    }

    public List<Item> getPlayerItems() {
        return player.getInventory().getItems();
    }

    public boolean getIsWinner() {
        return player.getInventory().getItems().size() == map.getNumItems();
    }

    public void printCellInfo() {
        Cell c = map.getCell(player.getPosition());
        System.out.println("Location: " + c.getName());
        System.out.println(c.getDescription());
        if(c.getIsVisited()){
            System.out.println("You have already visited this location.");
        }
        if(c.hasChest()){
            System.out.println("You found a chest! Type 'open' to see what's inside, or keep moving.");
        }
        c.visit();
    }

    public void openChest() {
        Cell c = map.getCell(player.getPosition());
        if(!c.hasChest()){
            System.out.println("No chest to open, sorry!");
        }else{
            if(c.getChest() == null){
                System.out.println("The chest is empty.");
            }else{
                player.getInventory().transferFrom(c.getChest());
                System.out.println("You collected these items: " + c.getChest().getItems());
            }
        }
    }

    public boolean canMove(Direction direction) {
        Position neiP = player.getPosition().getNeighbor(direction);
        if(neiP.getX() <= map.getWidth() && neiP.getY() <= map.getHeight()){
            return true;
        }else{
            return false;
        }
    }

    public void move(Direction direction) {
        if(!this.canMove(direction)){
            System.out.println("You can't go that way! Try another direction.");
        }else{
            player.move(direction);
            this.printCellInfo();
        }
    }
}
