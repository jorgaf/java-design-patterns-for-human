package com.j4loxa.j4edu.designpatterns.behavioral.strategy;

public class Sorter {
    private SortStrategy sorter;

    public Sorter(SortStrategy sorter) {
        this.sorter = sorter;
    }

    public void sort(int[] usortedArray) {
        sorter.sort(usortedArray);
    }
}
