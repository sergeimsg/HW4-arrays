package by.academy.les04.array;

import java.util.Random;

public class Task9Array {
    public static void main(String[] args) {
        int n = 100;
        int[] arr = new int[n];
        Random random = new Random();
        int min;
        int max;
        int iMax = 0;
        int iMin = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
            System.out.print("  arr" + i + " " + arr[i]);
        }
        max = arr[0];
        min = arr[0];
        System.out.println();

        for (int i = 0; i < n - 1; i++) {

            if (arr[i + 1] > max) {
                max = arr[i + 1];
                arr[i + 1] = max;
                iMax = i + 1;

            }

            if (arr[i + 1] < min) {
                min = arr[i + 1];
                iMin = i + 1;

            }
        }
        System.out.println("iMax=" + iMax);
        System.out.println("max = " + max);
        System.out.println("iMin=" + iMin);
        System.out.println("mmin= " + min);

        int temp;
        temp = arr[iMax];
        arr[iMax] = arr[iMin];
        arr[iMin] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print("  arr" + i + " " + arr[i]);

        }

    }
}
