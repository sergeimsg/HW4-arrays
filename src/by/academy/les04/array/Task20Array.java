package by.academy.les04.array;

import java.util.Random;

public class Task20Array {
    public static void main(String[] args) {

        int n = 1000;
        int temp = 0;
        Random rand = new Random();
        int[] arrZip = new int[n];

        for (int i = 0; i < arrZip.length; i++) {
            arrZip[i] = rand.nextInt(10)+1;      // to avoid zero digits in row
            System.out.print(" " + arrZip[i] + " ");     //random array to work
        }
        System.out.println();
        for (int i = 0; i < arrZip.length; i += 2) {
            arrZip[i] = 0;
        }

        for (int i = 0; i < arrZip.length; i++) {
            System.out.print(" " + arrZip[i] + " ");  // array to rework

        }


        while ((arrZip[(n / 2)] == 0 && arrZip[n / 2 + 1] != 0) || (arrZip[(n / 2)] != 0 && arrZip[n / 2 + 1] == 0)) {
            for (int i = 0; i < arrZip.length - 1; i++) {

                if (arrZip[i] == 0 && arrZip[i + 1] != 0) {

                    arrZip[i] = temp;
                    arrZip[i] = arrZip[i + 1];
                    arrZip[i + 1] = temp;

                }
            }
        }
            System.out.println();
            for (int i = 0; i < arrZip.length; i++) {
                System.out.print(" " + arrZip[i] + " "); // to check array

            }
        }

    }

