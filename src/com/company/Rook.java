package com.company;


import java.util.Scanner;

public class Rook extends Figure {
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
            for (int n = 1; n < array.length; n++) {
                if (x1 + n > array.length || y1 + n > array.length || x1 - n < 0 || y1 - n < 0){
                    System.out.println("Так нельзя походить");
                } else if ((player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] == '⛞' && x2 == x1 + n && y2 == y1) ||
                        ((player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] == '⛞' && x2 == x1 && y2 == y1 + n)) ||
                        ((player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] == '⛞' && x2 == x1 - n && y2 == y1)) ||
                        ((player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] == '⛞' && x2 == x1 && y2 == y1 - n))) {

                    array[x2][y2] = '♖';
                    array[x1][y1] = '⛞';
                    result = false;
                } else if ((player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] == '⛞' && x2 == x1 + n && y2 == y1) ||
                        ((player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] == '⛞' && x2 == x1 && y2 == y1 + n)) ||
                        ((player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] == '⛞' && x2 == x1 - n && y2 == y1)) ||
                        ((player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] == '⛞' && x2 == x1 && y2 == y1 - n))) {

                    array[x2][y2] = '♜';
                    array[x1][y1] = '⛞';
                    result = false;
                } else if ((player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] != '⛞' && x2 == x1 + n && y2 == y1) ||
                        ((player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] != '⛞' && x2 == x1 && y2 == y1 + n)) ||
                        ((player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] != '⛞' && x2 == x1 - n && y2 == y1)) ||
                        ((player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] != '⛞' && x2 == x1 && y2 == y1 - n))) {

                    System.out.println("БЕЛАЯ ладья бъёт чёрную фигуру");
                    array[x2][y2] = '♜';
                    array[x1][y1] = '⛞';
                    result = false;
                    beat = true;
                } else if ((player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] != '⛞' && x2 == x1 + n && y2 == y1) ||
                        ((player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] != '⛞' && x2 == x1 && y2 == y1 + n)) ||
                        ((player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] != '⛞' && x2 == x1 - n && y2 == y1)) ||
                        ((player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] != '⛞' && x2 == x1 && y2 == y1 - n))) {

                    System.out.println("ЧЁРНАЯ ладья бъёт белую фигуру");
                    array[x2][y2] = '♜';
                    array[x1][y1] = '⛞';
                    result = false;
                    beat = true;

                } else {
                    System.out.println("Так нельзя походить");
                }

            }
        }
        return beat;
    }
}