package by.academy.les04.array;

import java.util.Random;
import java.util.Scanner;

public class Task16Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("Loop doesn't work, try one more time. 'n' should be even");
            sc.nextLine();
        } else {
            int[] arrMaxSum = new int[n];
            Random maxR = new Random();
            int maxSum;
            int maxPrint = 0;

            for (int i = 0; i < arrMaxSum.length; i++) {
                arrMaxSum[i] = maxR.nextInt();
                System.out.print("  arrMaxSum[" + i + "]=" + arrMaxSum[i]);
            }
            System.out.println();

            int x = 0;          // loop from the beginning
            int y = arrMaxSum.length - 1;  // lop from the end
            int sum = 0;              // half loop
            int pair = 0;              // maximum pair of terms, to check

            while ((sum != arrMaxSum.length / 2)) {

                maxSum = arrMaxSum[x] + arrMaxSum[y];

                x++;
                y--;
                sum++;

                if (maxSum > maxPrint) {    // choose maximum
                    maxPrint = maxSum;
                    pair = sum;
                }

            }
            System.out.println("maxPrint= " + maxPrint+"; pair ="+pair);

        }

    }
}

