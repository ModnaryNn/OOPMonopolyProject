package gamefunction;

import gamefunction.Squares.GoSquare;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    public final List<Square> cells = new ArrayList<>();

    public GameBoard() {
    }

    public void addSquare(Square square) {
        cells.add(square);
    }

}
