package com.company;

import java.util.Scanner;

public class Elephant extends Figure {
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
            if (x2 > array.length || y2 > array.length || x2 < 0 || y2 < 0) {     //вариант выхода за пределы игрового поля
                System.out.println("Так нельзя походить");
            } else {
                boolean flag = true;
                int moveHorizontal = x2 - x1;
                int moveVertical = y2 - y1;
                if (Math.abs(moveHorizontal) != Math.abs(moveVertical)) {
                    System.out.println("Слон так не ходит");
                } else if (x2 > x1 && y2 > y1) {   //прверка ячеек при движении вниз вправо, если есть не пустые ячейки, то так нельзя походить
                    for (int i = 1; i < x2 - x1; i++) {
                        if (array[x1 + i][y1 + i] != '⛞') {
                            System.out.println("Здесь есть фигуры между исходной и конечной позицией. Такой ход недопустим.");
                            flag = false;
                        }
                    }
                    ElephantMove.showElephant(x1, y1, x2, y2, moveHorizontal, moveVertical, array, flag, result, beat);
                }

                if (x2 < x1 && y2 > y1) {           //проверка ячеек при движении вверх вправо, если есть не пустые ячейки, то так нельзя походить
                    for (int i = 1; i < x1 - x2; i++) {
                        if (array[x1 - i][y1 + i] != '⛞') {
                            System.out.println("Здесь есть фигуры между исходной и конечной позицией. Такой ход недопустим.");
                            flag = false;
                        }
                    }
                    ElephantMove.showElephant(x1, y1, x2, y2, moveHorizontal, moveVertical, array, flag, result, beat);
                }
                if (x2 < x1 && y2 < y1) {           //проверка ячеек при движении вверх влево, если есть не пустые ячейки, то так нельзя походить
                    for (int i = 1; i < x1 - x2; i++) {
                        if (array[x1 - i][y1 - i] != '⛞') {
                            System.out.println("Здесь есть фигуры между исходной и конечной позицией. Такой ход недопустим.");
                            flag = false;
                        }
                    }
                    ElephantMove.showElephant(x1, y1, x2, y2, moveHorizontal, moveVertical, array, flag, result, beat);

                }

                if (x2 > x1 && y2 < y1) {           //проверка ячеек при движении вниз влево, если есть не пустые ячейки, то так нельзя походить
                    for (int i = 1; i < x2 - x1; i++) {
                        if (array[x1 + i][y1 - i] != '⛞') {
                            System.out.println("Здесь есть фигуры между исходной и конечной позицией. Такой ход недопустим.");
                            flag = false;
                        }
                    }
                    ElephantMove.showElephant(x1, y1, x2, y2, moveHorizontal, moveVertical, array, flag, result, beat);

                }

            }


        }
        return beat;
    }
}


