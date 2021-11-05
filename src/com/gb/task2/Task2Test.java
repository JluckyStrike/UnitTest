package com.gb.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {
    private Task2 task2;

    @Test
    public void test(){
        task2 = new Task2();
        Assertions.assertEquals(true, Task2.find4And1(new int[] {1, 1, 1, 4, 4, 1, 4, 4}));
        Assertions.assertEquals(false, Task2.find4And1(new int[] {1, 1, 1, 1, 1, 1}));
        Assertions.assertEquals(false, Task2.find4And1(new int[] {4, 4, 4, 4}));
        Assertions.assertEquals(false, Task2.find4And1(new int[] {1, 4, 4, 1, 1, 4, 3}));
    }
}
