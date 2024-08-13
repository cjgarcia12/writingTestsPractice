package org.example;

import java.util.Arrays;

public class BubbleSort implements Sort {
    private final int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }
    @Override
    public void sort() {
        for (int i = 0; i < this.array.length - 1; i++) {
            for (int j = 0; j < this.array.length - i - 1; j++) {
                if (this.array[j] > this.array[j + 1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(this.array));
    }
}
