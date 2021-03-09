package com.bridgelabz.generic;

public class FindMax {

    public <E extends Comparable<E>> E findMax(E value1, E value2, E value3) {
        E max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        return max;
    }
}
