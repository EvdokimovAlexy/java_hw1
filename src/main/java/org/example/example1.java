//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
package org.example;
import java.util.Arrays;
import java.util.Random;
public class example1 {
    public static void main(String[] args) {
        ex1();
    }
    private static void ex1() {
        int[] binaryArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(binaryArray));
        Arrays.sort(binaryArray);
        System.out.println(Arrays.toString(binaryArray));
        System.out.println("Min element is " + binaryArray[0]);
        System.out.println("Max element is " + binaryArray[binaryArray.length-1]);

    }
}
