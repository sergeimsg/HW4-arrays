package by.academy.les04.array;

import java.util.Random;

public class Task11Array {
    public static void main(String[] args) {
        int n = 10;
        int M = 8;
        int L;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);

            if ((arr[i] % M > 0) && (arr[i] % M < (M - 1))) {
                System.out.println("arr[i]%M= " + arr[i] % M + "  arr" + i + " = " + arr[i]);
            }
        }

    }
}
