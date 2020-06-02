package com.company;

import java.util.Scanner;

public class Pawn extends Figure {
    @Override
    public boolean move(int x1, int y1, char[][] array, String player) {
        boolean result = true;
        boolean beat = false;
        while (result) {
            System.out.println("Введите номер клетки по горизонтали, куда хотите походить");
            Scanner scanner1 = new Scanner(System.in);
            int x2 = scanner1.nextInt();
            System.out.println("И по вертикали");
            Scanner scanner2 = new Scanner(System.in);
            int y2 = scanner2.nextInt();
            if (player == "БЕЛЫЙ" && array[x1][y1] == '♙' && array[x2][y2] == '⛞' && x2 == x1 + 1 && y2 == y1 && x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7) {
                array[x2][y2] = '♙';   //стандартный вариант хода пешки на след клетку
                array[x1][y1] = '⛞';
                result = false;
            } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♟' && array[x2][y2] == '⛞' && x2 == x1 - 1 && y2 == y1 && x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7) {
                array[x2][y2] = '♟';   //стандартный вариант хода пешки на след клетку
                array[x1][y1] = '⛞';
                result = false;
            } else if (player == "БЕЛЫЙ" && x1 == 1 && array[x1][y1] == '♙' && array[x2][y2] == '⛞' && x2 == x1 + 2 && y2 == y1 && x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7) {
                array[x2][y2] = '♙';   //вариант хода пешки через две клетки
                array[x1][y1] = '⛞';
                result = false;
            } else if (player == "ЧЁРНЫЙ" && x1 == 6 && array[x1][y1] == '♟' && array[x2][y2] == '⛞' && x2 == x1 - 2 && y2 == y1 && x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7) {
                array[x2][y2] = '♟';   //вариант хода пешки через две клетки
                array[x1][y1] = '⛞';
                result = false;
            } else if (player == "БЕЛЫЙ" && array[x1][y1] == '♙' && array[x2][y2] != '⛞' && x2 == x1 + 1 && (y2 == y1 + 1 || y2 == y1 - 1) && x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7) {
                System.out.println("БЕЛАЯ пешка бъет ЧЕРНУЮ фигуру");
                array[x2][y2] = '♙';   //вариант, когда белая пешка бъет фигуру
                array[x1][y1] = '⛞';
                result = false;
                beat = true;
            } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♟' && array[x2][y2] != '⛞' && x2 == x1 - 1 && (y2 == y1 - 1 || y2 == y1 + 1) && x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7) {
                System.out.println("ЧЁРНАЯ пешка бъет БЕЛУЮ фигуру");
                array[x2][y2] = '♟';   //вариант, когда черная пешка бъет фигуру
                array[x1][y1] = '⛞';
                result = false;
                beat = true;

            } else {
                System.out.println("Так пешка не ходит!");


            }

        }
        return beat;
    }
}