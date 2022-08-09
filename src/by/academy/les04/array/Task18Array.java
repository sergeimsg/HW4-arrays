package by.academy.les04.array;

import java.util.Random;

public class Task18Array {
    public static void main(String[] args) {
        int n;
        Random rand = new Random();
        int[] arrLock = new int[10];
        arrLock[0] = rand.nextInt(6) + 1;
        arrLock[1] = rand.nextInt(6) + 1;
        System.out.println(arrLock[0] + "--" + arrLock[1]);
//        if ((arrLock[1]+arrLock[2]<6)|| (arrLock[1]+arrLock[2]>=12)) {
//            System.out.println("Add higher value for 1 or 2 row, to have sum between [6,12}");
//
//        }

//        if  {
//            System.out.println("Add lower value for 1 or 2 row, to have sum between [6,12}");
//        }
        // else {
        for (int i = 2; i < 10; i++) {
            if ((arrLock[0] + arrLock[1] < 6) || (arrLock[0] + arrLock[1] > 12)) {
                System.out.println("Change value for 1 or 2 row, to have sum between [6,12}");
                break;
            } else {
                arrLock[i] = 10 - arrLock[i - 2] - arrLock[i - 1];

            }
        }

        for (int i = 0; i < 10; i++) {
            if ((arrLock[0] + arrLock[1] < 6) || (arrLock[0] + arrLock[1] > 12)) {
                break;
            } else {
                System.out.println("Right figure:");
                int m = i + 1;
                System.out.print(" #" + m + " = " + arrLock[i]);
                System.out.println();
            }

        }
    }
}
