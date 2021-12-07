package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] fractions = {1, 5, -3, 2, 3, 4, 34, 463, 24, 53, 15, 657, 16, -26, 54};
        System.out.println(Arrays.toString(fractions));
        double result = 0;
        boolean a = false;
        for (Double elements: fractions){
            result += elements;
        if (elements >= 0) {
            a = true;
        }
        else if (elements < 0){
            a = false;
        }

        }
        System.out.println(result/fractions.length);

    }
}
