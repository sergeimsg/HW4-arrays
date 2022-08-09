package by.academy.les04.array;

import java.util.Random;

public class Task19Array {
    public static void main(String[] args) {
        int n = 1000;
        Random rand = new Random();
        int[] arrFr = new int[n];
        int[] arrCount = new int[n];
        int max;
        int count;
        for (int i = 0; i < arrFr.length; i++) {
            arrFr[i] = rand.nextInt(1000);
            System.out.print("  arrFr[" + i + "]= " + arrFr[i]);
        }
        System.out.println();
        for (int i = 0; i < arrFr.length; i++) {
            count = 0;

            for (int j = i; j < arrFr.length; j++) {
                if (arrFr[i] == arrFr[j]) {
                    count++;
                }

            }
            System.out.println();
            System.out.print(" arrFr[" + i + "]= " + arrFr[i] + " count= " + count); // check frequency manually
            arrCount[i] = count;

        }
        System.out.println();
        for (int j = 0; j < arrCount.length; j++) {
            System.out.print(" arrCount[" + j + "]= " + arrCount[j]);  // check frequency manually

        }
        max = arrCount[0];
        for (int i = 1; i < arrCount.length; i++) {
            if (arrCount[i] > max) {
                max = arrCount[i];
            }

        }

        System.out.println();
        System.out.println("max = " + max);  //maximum frequency

        int countMax = 0;
        for (int i = 0; i < n; i++) {
            if (arrCount[i] == max) {
                countMax++;

            }

        }
        System.out.print("Digits quantity with maximum frequency "+max+" = " + countMax);

        System.out.println();
        if (countMax == 1) {
            for (int i = 0; i < n; i++) {
                if (arrCount[i] == max) {
                    System.out.println("Only one digit " + "first position arrFr[" + i + "]=" + arrFr[i] + ";  has frequency = " + max);
                    break;
                }

            }
        }
        int[] arrMax = new int[countMax];
        int nArrMax = 0;
        if (countMax > 1) {
            for (int i = 0; i < n; i++) {
                if (arrCount[i] == max) {
                    arrMax[nArrMax] = arrFr[i];

                    System.out.print(" arrMax[" + nArrMax + "]= " + arrMax[nArrMax] + ";");
                    nArrMax++;
                }
            }

            int min;
            min = arrMax[0];
            for (int l = 1; l < arrMax.length; l++) {
                if (arrMax[l] < min) {
                    min = arrMax[l];
                }

            }
            System.out.println();
            System.out.println("This minimal digit " + min + "; out of " + countMax + "  has frequency = " + max);

        }


    }


}




