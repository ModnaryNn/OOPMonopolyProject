package gamefunction;

import gamefunction.enums.ColorGroup;
import gamefunction.square.PropertySquare;

import java.util.*;

public abstract class GameBoard {

    private final List<Square> Squares = new ArrayList<>();
    //private final List<Card> chanceCards = new ArrayList<>();
    //private final List<Card> communityChestCards = new ArrayList<>();
    //the key of propertyColors is the name of the color group.
    private final Map<ColorGroup, Integer> propertyColors = new HashMap<>();

    public GameBoard() {
    }



    public final void addSquare(Square Square) {
        Squares.add(Square);
    }

    public void addSquare(PropertySquare Square) {
        int propertyNumber = getPropertyNumberForColor(Square.getColorGroup());
        propertyColors.put(Square.getColorGroup(), propertyNumber + 1);
        Squares.add(Square);
    }

    public Square getSquare(int index) {
        return Squares.get(index);
    }

    public int getSquareSize() {
        return Squares.size();
    }

    public int getPropertyNumberForColor(ColorGroup colorGroup) {
        Integer number = propertyColors.get(colorGroup);
        if (number != null)
            return number;
        return 0;
    }



}
