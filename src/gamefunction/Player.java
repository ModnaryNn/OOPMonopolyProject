package gamefunction;

public class Player {
    public int money;
    public String name;
    public int position;
    public boolean inJail;
    public boolean isOutOfGame;
    public int jailTurns;
    public int railCount;
    public int utilityCount;

    public Player(String name){
        money = 1500;
        this.name = name;
        position = 0;
        inJail = false;
        isOutOfGame = false;
        jailTurns = 0;
        railCount = 0;
    }

    public void setName(){
        this.name = name;
    }

    public void addMoney(int money){
        this.money += money;
    }

    public int getPosition(){
        return position;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public void setInJail(){
        this.inJail = true;
    }

    public void setOutOfJail(){
        this.inJail = false;
    }

    public void setOutOfGame(){
        this.isOutOfGame = true;
    }
}
