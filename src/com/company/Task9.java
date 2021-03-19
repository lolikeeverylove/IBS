package com.company;

import java.util.Scanner;

public class Task9 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        int n = scan.nextInt();
        double [] array = new double[n];
        System.out.println("Заполните массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1 +" элемент = " );
            array[i] = scan.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " элемент = " + array[i]*sum);
        }
    }
}
