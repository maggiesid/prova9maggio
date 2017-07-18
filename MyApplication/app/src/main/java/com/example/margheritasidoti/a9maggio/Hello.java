package com.example.margheritasidoti.a9maggio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by margheritasidoti on 09/05/17.
 */

public class Hello {

    public static void main(String[] args) {
        System.out.println(44%5);

        int array[][] = {{1, 1, 2, 3, 4}, {4, 5, 2, 4, 5}, {3, 2, 1, 3, 0}, {9, 9, 3, 2, 1}, {1, 1, 2, 4, 7}};
        int indexes[] = {0, 0, 0, 0, 0};

  /*      for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0) {
                    if (indexes[i] == 0)
                        indexes[i] = 1;
                    if (indexes[j] == 0)
                        indexes[j] = 1;
                }
            }
        }


        System.out.println(Arrays.toString(indexes));

        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] == 1) {
                turn2zero(array, i, i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        } */

    }

    private static void turn2zero(int[][] array, int row, int col) {
        System.out.println("L " + array[0].length);
        for (int i = 0; i < array[0].length; i++) {
            System.out.println(row + " " + i);
            array[row][i] = 0;
        }
        for (int j = 0; j < array[0].length; j++) {
            System.out.println(j + " " + col);
            array[j][col] = 0;
        }
    }
}
