/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rosso
 */
public class RandomArrayAction extends RecursiveAction {

    private final int threshold;
    private final int[] myArray;
    private int start;
    private int end;

    public RandomArrayAction(int[] myArray, int threshold, int start, int end) {
        this.threshold = threshold;
        this.myArray = myArray;
        this.start = start;
        this.end = end;
    }    

    protected void compute() {
        if (end - start < threshold) {
            for (int i = start; i <= end; i++) {
                myArray[i] = ThreadLocalRandom.current().nextInt();
            }
        } else {
            int midway = (end - start) / 2 + start;
            RandomArrayAction r1 = new RandomArrayAction(myArray, start,
                    midway, threshold);
            RandomArrayAction r2 = new RandomArrayAction(myArray,
                    midway + 1, end, threshold);
            invokeAll(r1, r2);
        }

    }
}
