package com.gb.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 1, 1, 4, 4};

        System.out.println(find4And1(arr));
    }

    public static boolean find4And1(int[] array){
        boolean have1 = false;
        boolean have2 = false;

        for (int i = array.length-1; i >= 0; i--) {
           if (array[i] == 1)
               have1 = true;
           else if (array[i] == 4)
               have2 = true;
           else
               return false;
        }

        return have1 && have2;
    }
}
