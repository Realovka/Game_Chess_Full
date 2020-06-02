package com.company;

public class Field {
    public static char[][] showField(){
        char[][] array = new char[8][8];
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                array[i][j]='⛞';
            }
        }
        for (int j=0; j<array.length; j++){
            array[1][j]='♙';
            array[6][j]='♟';
        }
        array[0][0]='♖';
        array[0][7]='♖';
        array[7][0]='♜';
        array[7][7]='♜';
        return array;
    }
}
