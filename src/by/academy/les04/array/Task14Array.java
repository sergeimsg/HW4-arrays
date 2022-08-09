package by.academy.les04.array;

import java.util.Random;

public class Task14Array {
    public static void main(String[] args) {
        int n = 100;
        int[] arr = new int[n];
        Random random = new Random();
        int min = 0;
        int max = 0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
            System.out.print("  arr[" + i + "]= " + arr[i]);
        }
        System.out.println();
        min = arr[1];
        max = arr[0];
        for (int i = 1; i < n; i += 2) {

            if (arr[i] < min) {
                min = arr[i];

            }

        }

        for (int i = 0; i < n; i += 2) {

            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("min =" + min);
        System.out.println("max =" + max);
        sum = min + max;
        System.out.println("sum = " + sum);

    }


}
