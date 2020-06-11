package com.company;

import java.util.Scanner;

public class Game {

    String player = "БЕЛЫЙ";

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
        array[0][1]='♘';
        array[0][6]='♘';
        array[7][1]='♞';
        array[7][6]='♞';
        array[0][2]='♗';
        array[0][5]='♗';
        array[7][5]='♝';
        array[7][2]='♝';
        return array;
    }

    public void showFieldNew(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }


    public void questionFigure(char[][] array, Pawn pawn, Rook rook, Horse horse, Elephant elephant ) {
        boolean gameEnd = true;
        while (gameEnd) {
            System.out.println("Ходит " + player + " игрок. Введите номер клетки по горизонтали, где стоит фигура");
            Scanner scanner1 = new Scanner(System.in);
            int x1 = scanner1.nextInt();
            System.out.println("И по вертикали");
            Scanner scanner2 = new Scanner(System.in);
            int y1 = scanner2.nextInt();
            if (x1 >= 8 || x1 < 0 || y1 >= 8 || y1 < 0) {
                System.out.println("Такой клетки нет, соответственно и фигуры там нет");   //случай, когда игрок превышает размерв поля
            } else if (array[x1][y1] == '⛞') {
                System.out.println("В этой клетке клетке нет фигуры. "); //случай, когда игрок хочет походить пустой клеткой
            } else if (player == "БЕЛЫЙ" && array[x1][y1] == '♟' ||
                    player == "ЧЁРНЫЙ" && array[x1][y1] == '♙') {
                System.out.println("Будьте внимательны! Сейчас ходит другой игрок!"); //случай, когда игрок пытается походить чужой фигурой
            } else if (array[x1][y1] == '♙'||array[x1][y1] == '♟') {
                boolean result = pawn.move(x1, y1, array, player);
                showFieldNew(array);
                if (player == "БЕЛЫЙ" && result==false) {
                    player = "ЧЁРНЫЙ";
                } else {
                    player = "БЕЛЫЙ";
                }
            } else if (array[x1][y1] == '♖'||array[x1][y1] == '♜') {
                boolean result = rook.move(x1, y1, array, player);
                showFieldNew(array);
                if (player == "БЕЛЫЙ" && result==false) {
                    player = "ЧЁРНЫЙ";
                } else {
                    player = "БЕЛЫЙ";
                }
            }
            else if (array[x1][y1] == '♘'||array[x1][y1] == '♞') {
                boolean result = horse.move(x1, y1, array, player);
                showFieldNew(array);
                if (player == "БЕЛЫЙ" && result==false) {
                    player = "ЧЁРНЫЙ";
                } else {
                    player = "БЕЛЫЙ";
                }
            }
            else if (array[x1][y1] == '♗'||array[x1][y1] == '♝') {
                boolean result = elephant.move(x1, y1, array, player);
                showFieldNew(array);
                if (player == "БЕЛЫЙ" && result==false) {
                    player = "ЧЁРНЫЙ";
                } else {
                    player = "БЕЛЫЙ";
                }
            }
        }
    }
}
