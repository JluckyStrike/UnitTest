package com.gb.task1;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};

        System.out.println(Arrays.toString(test(arr)));
    }

    public static int[] test(int[] array){
        int lastIndex4 = find4(array);

        if (lastIndex4 < 0)
            throw new RuntimeException("В переданном массиве нет цифры 4");

        int[] newArray = new int[array.length-(lastIndex4+1)];

        for (int i = lastIndex4+1, c = 0; i < array.length; i++, c++) {
            newArray[c] = array[i];
        }

        return newArray;
    }

    public static int find4(int[] array){
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] == 4)
                return i;
        }

        return -1;
    }

    public static int add(int a, int b){
        return a + b;
    }
}
