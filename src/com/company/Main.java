package com.company;

public class Main {

    public static void main(String[] args) {

        char[][]array = Game.showField();
        Pawn pawn = new Pawn();
        Rook rook =new Rook();
        Horse horse=new Horse();
        Game game = new Game();
        game.showFieldNew(array);
        game.questionFigure(array, pawn, rook, horse);
    }

}
