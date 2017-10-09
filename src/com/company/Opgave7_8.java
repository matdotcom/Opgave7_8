package com.company;

import java.util.Scanner;

public class Opgave7_8 {

    public static void main(String[] args) {
        System.out.println(" Enter 10 Numbers");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println(" The average is " + average(numbers));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
// her returnerer den summen divideret med array's som er givet af brugeren.
        return sum / array.length;

    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

}
