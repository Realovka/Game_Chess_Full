package com.company;

import java.util.Scanner;

public class Game {
    String player = "БЕЛЫЙ";

    public void showField(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }


    public void questionFigure(char[][] array, Figure a) {
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
            } else {
                boolean result= a.move(x1, y1, array, player);
                showField(array);
                if (player == "БЕЛЫЙ" && result==false) {
                    player = "ЧЁРНЫЙ";
                } else {
                    player = "БЕЛЫЙ";
                }
            }
        }
    }
}
