package com.j4loxa.j4edu.designpatterns.behavioral.strategy;


public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] dataset) {
        for(var i = 0; i < dataset.length - 1; i ++) {
            for (var j = i + 1; j < dataset.length; j++) {
                if(dataset[i] > dataset[j]) {
                    var aux = dataset[i];
                    dataset[i] = dataset[j];
                    dataset[j] = aux;
                }
            }
        }
    }
}
