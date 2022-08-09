package by.academy.les04.array;

import java.util.Random;

public class Task2Array {
    public static void main(String[] args) {
        int n = 100;
        Random random = new Random();

        int[] arr = new int[n];

        int countZero = 0;

        for (int i = 0; i < n; i++) {
            int temp = random.nextInt(100);
            arr[i] = temp;
            if (arr[i] == 0) {
                countZero++;   // zero massive length
            }

        }
        System.out.println("countZero = " + countZero); // zero quantity

        int[] arr0 = new int[countZero];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr0[j] = i;

                System.out.println("arr[" + i + "]=" + arr[i]);   // massive zero numbers
                System.out.println("arr0[" + j + "]=" + arr0[j]);   // massive zero numbers
                j++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d]", arr[i]);

        }
        System.out.println();
        for (int x = 0; x < arr0.length; x++) {
            System.out.printf("{%d}",arr0[x]);

        }

    }
}
