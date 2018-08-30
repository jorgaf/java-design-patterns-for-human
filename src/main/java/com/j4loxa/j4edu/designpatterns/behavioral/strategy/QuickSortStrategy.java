package com.j4loxa.j4edu.designpatterns.behavioral.strategy;

import java.util.Arrays;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] dataset) {

        Arrays.sort(dataset);
    }
}
