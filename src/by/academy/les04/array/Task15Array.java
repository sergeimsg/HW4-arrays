package by.academy.les04.array;

import java.util.Random;

public class Task15Array {
    public static void main(String[] args) {
        int n = 100;
        double[] arrPart = new double[n];
        Random random = new Random();
        double c = -0.256;
        double d = 0.687;
        for (int i = 0; i < arrPart.length; i++) {
            arrPart[i]= random.nextDouble();

            if ((arrPart[i]>=c) && (arrPart[i]<=d))
            {

                System.out.printf("[%4.3f]", arrPart[i]);
            }

        }
    }
}
