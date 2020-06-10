package com.company;

import java.util.Scanner;

public class Horse extends Figure {
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
            if (((x2 == x1 - 2 && y2 == y1 - 1) || (x2 == x1 - 1 && y2 == y1 - 2) || (x2 == x1 + 1 && y2 == y1 - 2) || (x2 == x1 + 2 && y2 == y1 - 1) ||
                    (x2 == x1 + 2 && y2 == y1 + 1) || (x2 == x1 + 1 && y2 == y1 + 2) || (x2 == x1 - 1 && y2 == y1 + 2) || (x2 == x1 - 2 && y2 == y1 + 1)) &&
                    player.equals("БЕЛЫЙ") && array[x1][y1] == '♘' && array[x2][y2] == '⛞') {
                array[x1][y1] = '⛞';
                array[x2][y2] = '♘';
                result = false;
            } else {
                if (((x2 == x1 - 2 && y2 == y1 - 1) || (x2 == x1 - 1 && y2 == y1 - 2) || (x2 == x1 + 1 && y2 == y1 - 2) || (x2 == x1 + 2 && y2 == y1 - 1) ||
                        (x2 == x1 + 2 && y2 == y1 + 1) || (x2 == x1 + 1 && y2 == y1 + 2) || (x2 == x1 - 1 && y2 == y1 + 2) || (x2 == x1 - 2 && y2 == y1 + 1)) &&
                        player.equals("ЧЁРНЫЙ") && array[x1][y1] == '♞' && array[x2][y2] == '⛞') {
                    array[x1][y1] = '⛞';
                    array[x2][y2] = '♞';
                    result = false;
                } else {
                    if (((x2 == x1 - 2 && y2 == y1 - 1) || (x2 == x1 - 1 && y2 == y1 - 2) || (x2 == x1 + 1 && y2 == y1 - 2) || (x2 == x1 + 2 && y2 == y1 - 1) ||
                            (x2 == x1 + 2 && y2 == y1 + 1) || (x2 == x1 + 1 && y2 == y1 + 2) || (x2 == x1 - 1 && y2 == y1 + 2) || (x2 == x1 - 2 && y2 == y1 + 1)) &&
                            player.equals("БЕЛЫЙ") && array[x1][y1] == '♘' && array[x2][y2] != '⛞') {
                        System.out.println("Белый конь бъет черную фигуру");
                        array[x1][y1] = '⛞';
                        array[x2][y2] = '♘';
                        result = false;
                        beat = true;
                    } else {
                        if (((x2 == x1 - 2 && y2 == y1 - 1) || (x2 == x1 - 1 && y2 == y1 - 2) || (x2 == x1 + 1 && y2 == y1 - 2) || (x2 == x1 + 2 && y2 == y1 - 1) ||
                                (x2 == x1 + 2 && y2 == y1 + 1) || (x2 == x1 + 1 && y2 == y1 + 2) || (x2 == x1 - 1 && y2 == y1 + 2) || (x2 == x1 - 2 && y2 == y1 + 1)) &&
                                player.equals("ЧЁРНЫЙ") && array[x1][y1] == '♞' && array[x2][y2] != '⛞') {
                            System.out.println("Чёрный конь бъет белую фигуру");
                            array[x1][y1] = '⛞';
                            array[x2][y2] = '♞';
                            result = false;
                            beat = true;
                        } else {
                            System.out.println("Так конь не ходит");
                        }
                    }
                }
            }
        }
        return beat;
    }
}
