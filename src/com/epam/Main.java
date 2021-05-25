package com.epam;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {

    private static final int SIZE = 10000;

    public static void main(String[] args) {

        int[] data = new int[SIZE];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            int randomNum = rand.nextInt((SIZE) + 1);

            data[i] = randomNum;

        }
        System.out.println("data = " + Arrays.toString(data));
        QuickSortAction quickSort = new QuickSortAction(data);

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(quickSort);

        pool.shutdown();

        System.out.println("data = " + Arrays.toString(data));

    }
}
