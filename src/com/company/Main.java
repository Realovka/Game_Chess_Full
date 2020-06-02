package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] array = new char[8][8];
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                array[i][j]='_';
            }
        }
        for (int j=0; j<array.length; j++){
            array[1][j]='X';
            array[6][j]='O';
        }
        Figure pawn = new Pawn();
        Game game = new Game();
        game.showField(array);
        game.questionFigure(array, pawn);
    }


}
