package by.academy.les04.array;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int n = 100;
        int out = 0;

        Random rand = new Random();
        int[] arrSort = new int[n];
        for (int i = 0; i < arrSort.length; i++) {
            arrSort[i] = rand.nextInt(100);
            System.out.print("  " + arrSort[i]);
        }


        for (int i = 1; i < arrSort.length; i++) {
            out = arrSort[i];

            int j = i;

            while (j > 0 && arrSort[j-1] >= out ) {
                arrSort[j] = arrSort[j - 1];
                j--;
            }
                arrSort[j] = out;

            }
            System.out.println();

        for (int i = 0; i < arrSort.length; i++) {

            System.out.print("  " + arrSort[i]);
        }
    }
}


