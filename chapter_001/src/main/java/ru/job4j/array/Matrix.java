package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int i = size;
        int j = size;
        int[][] table = new int[i][j];
        for (i = 0; i < table.length; i++ ) {
            for (j = 0; j < table.length; j++)
                table [i][j] = (i+1)*(j+1);
        }
        return table;
    }
}