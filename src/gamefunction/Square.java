package gamefunction;

import gui.Position;

public abstract class  Square {
    public boolean available;
    public int id;
    public String name;
    public Player player;
    public Position position;

    //CONSTRUCTOR
    public Square(int id, String name, Position position){
        this.available = true;
        this.id = id;
        this.name = name;
        this.position = position;
    }

    //METHODS
    public void playAction(GameHandler gameHandler) {}


    //GETTERS SETTERS

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Player getOwner() {
        return player;
    }

    public boolean isAvailable() {
        return available;
    }


    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return name;
    }
}