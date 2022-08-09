package by.academy.les04.array;

import java.util.Random;

public class Task1Array {
    public static void main(String[] args) {
        int n = 10;
        int[] A = new int[n];
        int k = 3;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            A[i]= random.nextInt(100);
            if (A[i]%k==0) {
                System.out.println("Multiple k = " + k +" to " + A[i]);
            }

        }

    }
}
