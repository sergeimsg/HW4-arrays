package by.academy.les04.array;

import java.util.Random;

public class Task7Array {
    public static void main(String[] args) {
        int n = 100;
        Random ran = new Random();
        double[] arr = new double[n];
        double z = 25.25;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = ran.nextDouble(100);

            if (arr[i] > z) {
                System.out.println("arr[" + i + "]=" + arr[i]);
                arr[i] = z;
                count++;
                System.out.println("arr[" + i + "]=" + arr[i]);
            }

        }
        System.out.println("count= " + count);
    }
}
