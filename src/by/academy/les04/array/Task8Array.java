package by.academy.les04.array;

import java.util.Random;

public class Task8Array {
    public static void main(String[] args) {
        int n = 100;
        int[] arr = new int[n];
        Random random = new Random();
        int negative = 0;
        int positive = 0;
        int zero = 0;

       for (int i = 0; i < n; i++) {
            arr[i] = 50-random.nextInt(100);
            if (arr[i]==0){
                zero++;
            }
            if (arr[i]>0){
                positive++;
            }
            if (arr[i]<0){
                negative++;
            }
        }

       System.out.println("positive = " + positive+";  negative=" + negative +"; zero=" +zero);

    }
}
