package by.academy.les04.array;

import java.util.Random;

public class Task5Array {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 100;
        int[] arr = new int[n];

        int even = 0;
        int ev = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        if (even==0) {
            System.out.println("No evens in array");
        }
        System.out.println("quantity of evens = " + even);

        int[] arrEven = new int[even];

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arrEven[ev] = arr[i];
                System.out.println("arrEven[" + ev + "]=" + arrEven[ev]);
                ev++;
            }
        }


    }
}



