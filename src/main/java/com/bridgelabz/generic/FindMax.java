package com.bridgelabz.generic;

public class FindMax {

    @SafeVarargs
    public final <E extends Comparable<E>> E findMax(E... intNum) {
        for (E e : intNum) {
            System.out.println(e);
        }

        E temp;

        for (int i = 0; i < (intNum.length - 1); i++) {
            for (int j = 0; j < (intNum.length - 1); j++) {
                if (intNum[j].compareTo(intNum[j + 1]) < 0) {
                    temp = intNum[j];
                    intNum[j] = intNum[j + 1];
                    intNum[j + 1] = temp;
                }
            }
        }

        return intNum[0];
    }

    public <E> void printMax(E max) {

        System.out.println("Maximum Value is:" + max);
    }
}
