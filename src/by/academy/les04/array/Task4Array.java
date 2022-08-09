package by.academy.les04.array;

import java.util.Random;

public class Task4Array {
    public static void main(String[] args) {
        int n = 100;
        Random rnd = new Random();
        int[] arrMinMax = new  int[n];
        for (int i = 0; i < arrMinMax.length; i++) {
            arrMinMax[i] = rnd.nextInt(100);
        }
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < arrMinMax.length/2-1; i++) {
            sum1 = sum1+arrMinMax[i];

        }
        for (int i = arrMinMax.length-1; i >arrMinMax.length/2 ; i--) {

            sum2=sum2+arrMinMax[i];

        }
        if (sum1>sum2) {
            System.out.println("sum1 "+sum1+" sum2 = "+sum2+" "+"Sequence is decreasing");
        }
        if (sum1<sum2) {
            System.out.println("sum1 "+sum1+" sum2 = "+sum2+" "+"Sequence is increasing");
        }
    }
}
