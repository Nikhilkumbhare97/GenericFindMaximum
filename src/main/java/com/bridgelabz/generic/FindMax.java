package com.bridgelabz.generic;

public class FindMax {

    public Integer findMaxInt(Integer firstPosition, Integer secondPosition, Integer thirdPosition) {
        Integer max = firstPosition;
        if (secondPosition.compareTo(max) > 0) {
            max = secondPosition;
        }
        if (thirdPosition.compareTo(max) > 0) {
            max = thirdPosition;
        }
        return max;
    }

    public Float findMaxFloat(Float firstPosition, Float secondPosition, Float thirdPosition) {
        Float max = firstPosition;
        if (secondPosition.compareTo(max) > 0) {
            max = secondPosition;
        }
        if (thirdPosition.compareTo(max) > 0) {
            max = thirdPosition;
        }
        return max;
    }
}
