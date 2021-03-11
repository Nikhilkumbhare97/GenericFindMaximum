package com.bridgelabz.generic;

public class FindMax {

    public static <E extends Comparable<E>> E findMax(E... intNum) {
        for ( int i = 0; i < intNum.length; i ++ ) {
            System.out.println(intNum[i]);
        }
        E temp;
        for (int i =0 ; i<(intNum.length - 1 ); i ++) {
            for ( int j = 0; j<(intNum.length - 1); j++) {
                if ( intNum[j].compareTo(intNum[j + 1]) < 0 ) {
                    temp = intNum[j] ;
                    intNum[j] = intNum[j + 1] ;
                    intNum[j+1] = temp ;
                }
            }
        }
        E max = intNum[0];
        return max;
    }

    public static <E> E printMax(E max) {
        System.out.println("Maximum Value is:" + max) ;
        return max;
    }
}
