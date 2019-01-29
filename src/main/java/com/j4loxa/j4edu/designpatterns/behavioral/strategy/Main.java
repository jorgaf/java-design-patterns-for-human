package com.j4loxa.j4edu.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {1, 10, 2, 16,19};
        int[] unsortedArray2 = {3, 9, 15, 1, 4};
        var sorter = new Sorter(new BubbleSortStrategy());

        sorter.sort(unsortedArray);
        for(var nro : unsortedArray) {
            System.out.println(nro);
        }

        sorter = new Sorter(new QuickSortStrategy());
        sorter.sort(unsortedArray2);
        for (var nro : unsortedArray2) {
            System.out.println(nro);
        }
    }
}
