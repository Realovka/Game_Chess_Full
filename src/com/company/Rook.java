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
            int moveHorizontal = x2 - x1;
            int moveVertical = y2 - y1;
            if (x2 > array.length || y2 > array.length || x2 < 0 || y2 < 0) {     //вариант выхода за пределы игрового поля
                System.out.println("Так нельзя походить");
            } else {
                boolean flag = true;
                if (x1 < x2) {
                    for (int i = 1; i <= x2 - x1 - 1; i++) {
                        if (array[x1 + i][y2] != '⛞' || y1 != y2) {
                            System.out.println("Здесь есть фигуры между исходной позицией и конечной. Такой ход недопустим ");
                            flag = false;
                        }

                    }
                    if (player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] == '⛞' && x2 == x1 + moveHorizontal && y2 == y1 && flag == true) {
                        array[x2][y2] = '♖';           // вариант движения белой ладьи на пустую клетку по вертикали
                        array[x1][y1] = '⛞';
                        result = false;
                    } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] == '⛞' && x2 == x1 + moveHorizontal && y2 == y1 && flag == true) {
                        array[x2][y2] = '♜';       //вариант движения черной ладьи на пустую клетку по вертикали
                        array[x1][y1] = '⛞';
                        result = false;
                    } else if (player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] != '⛞' && x2 == x1 + moveHorizontal && y2 == y1 && flag == true) {
                        System.out.println("БЕЛАЯ ладья бъёт чёрную фигуру");
                        array[x2][y2] = '♖';          //вариант, когда белая ладья бьет черную фигуру по вертикали
                        array[x1][y1] = '⛞';
                        result = false;
                        beat = true;
                    } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] != '⛞' && x2 == x1 + moveHorizontal && y2 == y1 && flag == true) {
                        System.out.println("ЧЁРНАЯ ладья бъёт белую фигуру");
                        array[x2][y2] = '♜';          //вариант, когда черная ладья бьет белую фигуру по вертикали
                        array[x1][y1] = '⛞';
                        result = false;
                        beat = true;
                    }
                }


                if (y1 < y2) {
                    for (int i = 1; i <= y2 - y1 - 1; i++) {
                        if (array[x2][y1 + i] != '⛞' || x1 != x2) {
                            System.out.println("Здесь есть фигуры между исходной позицией и конечной. Такой ход недопустим ");
                            flag = false;
                        }

                    }
                    if (player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] == '⛞' && x2 == x1 && y2 == y1 + moveVertical && flag == true) {
                        array[x2][y2] = '♖';           // вариант движения белой ладьи на пустую клетку по горизонтали
                        array[x1][y1] = '⛞';
                        result = false;
                    } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] == '⛞' && x2 == x1 && y2 == y1 + moveVertical && flag == true) {
                        array[x2][y2] = '♜';       //вариант движения черной ладьи на пустую клетку по горизонтали
                        array[x1][y1] = '⛞';
                        result = false;
                    } else if (player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] != '⛞' && x2 == x1 && y2 == y1 + moveVertical && flag == true) {
                        System.out.println("БЕЛАЯ ладья бъёт чёрную фигуру");
                        array[x2][y2] = '♜';          //вариант, когда белая ладья бьет черную фигуру
                        array[x1][y1] = '⛞';
                        result = false;
                        beat = true;
                    } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] != '⛞' && x2 == x1 && y2 == y1 + moveVertical && flag == true) {
                        System.out.println("ЧЁРНАЯ ладья бъёт белую фигуру");
                        array[x2][y2] = '♜';          //вариант, когда черная ладья бьет белую фигуру по горизонтали
                        array[x1][y1] = '⛞';
                        result = false;
                        beat = true;
                    }
                }


                if (x2 < x1) {
                    for (int i = 1; i <= x1 - x2 - 1; i++) {
                        if (array[x1 + i][y2] != '⛞' || y1 != y2) {
                            System.out.println("Здесь есть фигуры между исходной позицией и конечной. Такой ход недопустим ");
                            flag=false;
                        }
                        break;
                    }
                    if (player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] == '⛞' && x2 == x1 + moveHorizontal && y2 == y1 && flag==true) {
                        array[x2][y2] = '♖';           // вариант движения белой ладьи на пустую клетку по вертикали
                        array[x1][y1] = '⛞';
                        result = false;
                    } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] == '⛞' && x2 == x1 + moveHorizontal && y2 == y1 && flag==true) {
                        array[x2][y2] = '♜';       //вариант движения черной ладьи на пустую клетку по вертикали
                        array[x1][y1] = '⛞';
                        result = false;
                    } else if (player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] != '⛞' && x2 == x1 + moveHorizontal && y2 == y1 && flag==true) {
                        System.out.println("БЕЛАЯ ладья бъёт чёрную фигуру");
                        array[x2][y2] = '♖';          //вариант, когда белая ладья бьет черную фигуру по вертикали
                        array[x1][y1] = '⛞';
                        result = false;
                        beat = true;
                    } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] != '⛞' && x2 == x1 + moveHorizontal && y2 == y1 && flag==true) {
                        System.out.println("ЧЁРНАЯ ладья бъёт белую фигуру");
                        array[x2][y2] = '♜';          //вариант, когда черная ладья бьет белую фигуру по вертикали
                        array[x1][y1] = '⛞';
                        result = false;
                        beat = true;
                    }
                }


                if (y2 < y1) {
                    for (int i = 1; i <= y1 - y2 - 1; i++) {
                        if (array[x2][y1 - i] != '⛞' || x1 != x2) {
                            System.out.println("Здесь есть фигуры между исходной позицией и конечной. Такой ход недопустим ");
                            flag=false;
                        }
                    }
                    if (player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] == '⛞' && x2 == x1 && y2 == y1 + moveVertical && flag==true) {
                        array[x2][y2] = '♖';           // вариант движения белой ладьи на пустую клетку по горизонтали
                        array[x1][y1] = '⛞';
                        result = false;
                    } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] == '⛞' && x2 == x1 && y2 == y1 + moveVertical && flag==true) {
                        array[x2][y2] = '♜';       //вариант движения черной ладьи на пустую клетку по горизонтали
                        array[x1][y1] = '⛞';
                        result = false;
                    } else if (player == "БЕЛЫЙ" && array[x1][y1] == '♖' && array[x2][y2] != '⛞' && x2 == x1 && y2 == y1 + moveVertical && flag==true) {
                        System.out.println("БЕЛАЯ ладья бъёт чёрную фигуру");
                        array[x2][y2] = '♜';          //вариант, когда белая ладья бьет черную фигуру
                        array[x1][y1] = '⛞';
                        result = false;
                        beat = true;
                    } else if (player == "ЧЁРНЫЙ" && array[x1][y1] == '♜' && array[x2][y2] != '⛞' && x2 == x1 && y2 == y1 + moveVertical && flag==true) {
                        System.out.println("ЧЁРНАЯ ладья бъёт белую фигуру");
                        array[x2][y2] = '♜';          //вариант, когда черная ладья бьет белую фигуру по горизонтали
                        array[x1][y1] = '⛞';
                        result = false;
                        beat = true;
                    }

                }
            }
        }
        return beat;

    }

}







