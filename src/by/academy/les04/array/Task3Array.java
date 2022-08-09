package by.academy.les04.array;

import java.util.Random;

public class Task3Array {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 100;
        int[] arr = new int[n];
        for (int i = 0; i < 100; i++) {
            arr[i] = 50 - random.nextInt(100);
           // System.out.println(arr[i]);             // to check array
            }
        for (int i = 0; i < n; i++) {
            if (arr[i]>0) {
                System.out.println("Positive number first");
            }
            else {
                System.out.println("Negative number first");
            }

            break;

        }
    }
}
