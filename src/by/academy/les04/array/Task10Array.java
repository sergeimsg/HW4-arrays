package by.academy.les04.array;

import java.util.Random;

public class Task10Array {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= random.nextInt(10);

            if (arr[i]>i)
            {
                System.out.print("arr"+i+ "= " + arr[i]);
            }
        }


    }
}
