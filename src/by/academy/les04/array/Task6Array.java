package by.academy.les04.array;

import java.util.Random;

public class Task6Array {
    public static void main(String[] args) {
        int n = 100;
        Random random = new Random();
        double[] arrayDist = new double[n];
        double min;
        double max;
        double distance;
        for (int i = 0; i < arrayDist.length; i++) {
            arrayDist[i]=5-random.nextDouble(10);
            System.out.print("-"+arrayDist[i]);
        }
        max = arrayDist[0];
        min = arrayDist[0];
        for (int i = 1; i < arrayDist.length-1; i++) {
            if (arrayDist[i] > max) {
                max = arrayDist[i];
            }
        }
        for (int i = 1; i < arrayDist.length-1; i++) {
                if (arrayDist[i]<min) {
                    min=arrayDist[i];
                }
        }
        System.out.println();
        System.out.println(min);
        System.out.println(max);
        if (min>=0) {
            distance=max-min;
            System.out.println("distance = "+distance);
        }
        if ((min<0) && (max>=0)) {
            distance = max+Math.abs(min);
            System.out.println("distance = "+distance);
        }

        if ((min<0) && (max<0)) {
            distance = Math.abs(min)-Math.abs(max);
            System.out.println("distance = "+distance);
        }
    }
}
