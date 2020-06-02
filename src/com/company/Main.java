package com.company;

public class Main {

    public static void main(String[] args) {

        char[][] array = Field.showField();
        Figure pawn = new Pawn();
        Figure rook = new Rook();
        Game game = new Game();
        game.showField(array);
        game.questionFigure(array, pawn);
    }


}
