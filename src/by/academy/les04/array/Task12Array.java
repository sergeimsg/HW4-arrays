package by.academy.les04.array;

import java.util.Random;

public class Task12Array {
    public static void main(String[] args) {
        int n = 100;
        double[] arr = new double[n];
        Random random = new Random();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] =random.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = 0; j < n; j++) {
                if ((j != 0) && (i != 0) && (i % j == 0)) {
                    ++c;
                }
            }

            if (c == 2) {
                sum=sum+arr[i];

                System.out.println("sum= " + sum + "   arr[" + i + "]=" + arr[i]);
            }

        }
    }
}

