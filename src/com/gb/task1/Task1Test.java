package com.gb.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void test(){
        Assertions.assertArrayEquals(new int[] {1, 7}, Task1.test(new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}));
        
    }

    @Test
    public void testExceptionTask1() {
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            Task1.test(new int[] {1, 2, 3});
        });

        String expectedMessage = "В переданном массиве нет цифры 4";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}
