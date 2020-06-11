package com.company;

public class ElephantMove {
    public  static void showElephant(int x1, int y1, int x2, int y2, int moveHorizontal, int moveVertical, char array [][], boolean flag, boolean result, boolean beat){
        if (array[x1][y1] == '♗' && array[x2][y2] == '⛞'  && flag==true) {
            array[x2][y2] = '♗';
            array[x1][y1] = '⛞';
            result = false;
        } else if (array[x1][y1] == '♝' && array[x2][y2] == '⛞' && flag==true) {
            array[x2][y2] = '♝';
            array[x1][y1] = '⛞';
            result = false;
        } else if (array[x1][y1] == '♗' && array[x2][y2] != '⛞' && flag==true) {
            System.out.println("Белый слон бъёт чёрную фигуру");
            array[x2][y2] = '♗';
            array[x1][y1] = '⛞';
            result = false;
            beat = true;
        } else if (array[x1][y1] == '♝' && array[x2][y2] == '⛞' && flag==true) {
            System.out.println("Чёрный слон бъёт белую фигуру");
            array[x2][y2] = '♝';
            array[x1][y1] = '⛞';
            result = false;
            beat = true;
        }
    }
}