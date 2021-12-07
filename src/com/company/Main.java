package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        float[] fractions = {1, 5, -3, 2, 3, 4, 34, 463, 24, 53, 15, 657, 16, -26, 54};
        System.out.println(Arrays.toString(fractions));

        float[] arifmatic = {8, -2, -4, 2, 3, 6};
        float result = 0;
        for(Float elements: arifmatic){
            result += elements;
        }
        System.out.println(result/arifmatic.length);
    }
}
