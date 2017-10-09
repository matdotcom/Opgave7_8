package com.company;

import java.util.Scanner;

public class Opgave7_8 {

    public static void main(String[] args) {
        // her skriver den i konsollen at vi skal skrive 10 tal
        System.out.println(" Enter 10 Numbers");
        // her importerer vi en ny scanner.
        Scanner input = new Scanner(System.in);
        // her laver vi en liste som indholder 10 ting af værdien double
        double[] numbers = new double[10];
        // her laver vi et for loop som gør at den spørger om nyt input indtil vi har nået 10
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
