package by.academy.les04.array;

import java.util.Random;

public class Task17Array {
    public static void main(String[] args) {
        int n = 100;
        int min;
        int accurance = 0;
        Random rand = new Random();
        int[] arrayMinus = new int[n];
        for (int i = 0; i < arrayMinus.length; i++) {
            arrayMinus[i] = rand.nextInt(100);
            System.out.print(" arrayMinus["+i+"]=" + arrayMinus[i]); // random array
        }
        System.out.println();
        min = arrayMinus[0];
        for (int i = 1; i < arrayMinus.length; i++) {

            if (arrayMinus[i] < min) {
                min = arrayMinus[i];

            }

        }

        for (int i = 0; i < arrayMinus.length; i++) {
            if (arrayMinus[i] == min) {
                accurance++;
            }
        }
        System.out.println();
        System.out.println("accurance= " + accurance);  // number of mins

        int[] newArr = new int[arrayMinus.length - accurance];

        int nMin = 0;    //accurance control

        while (accurance != 0) {

            for (int i = 0; i < arrayMinus.length - nMin; i++) {
                if (arrayMinus[i] == min) {
                    nMin++;
                    System.out.println("");
                    System.out.println("nMin=" + nMin + " i=" + i);   // min position

                    if (arrayMinus[arrayMinus.length - 1] == min) {
                        i = arrayMinus.length - 2;
                        nMin++;
                    } else {

                        for (int j = i; j < arrayMinus.length - nMin; j++) {
                            arrayMinus[j] = arrayMinus[j + 1];
                            System.out.print(" arrayMinus["+j+"]=" + arrayMinus[j]); // array rows shift
                        }

                    }
                }


            }
            accurance = accurance - nMin;
            System.out.println();
            //System.out.println("end of nMin= " + nMin + "  accurance=" + accurance);

        }
        for (int i = 0; i < newArr.length; i++) {

            newArr[i] = arrayMinus[i];
            System.out.print("  newArr["+i+"]= " + newArr[i]);  // final new array

        }

    }


}


