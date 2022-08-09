package by.academy.les04.array;

import java.util.Random;

public class Task13Array {
    public static void main(String[] args) {
        int n = 100;  // array size
        int M = 8;    //
        int L = 5;    // low range
        int Nn = 10;   // high range
        int[] arr = new int[n];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);

            if (((arr[i]%M==0) && (arr[i]/M>L)) && (arr[i]/M<Nn))
            {
                sum++;
                System.out.println("sum= " + sum  + "   arr[" + i + "]=" + arr[i]);

            }
            }
        System.out.println("sum = " + sum);
    }
}
