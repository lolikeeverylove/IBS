package com.company;

import java.util.Scanner;

public class Task14 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = new int[5];
        System.out.println("Заполните массив из 15 элементов рандомными значениями в диапазоне от -20 до 20");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1 +" элемент = " );
            array[i] = scan.nextInt();
        }
        scan.close();

        int max = 0;
        int min = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[max]) {
                max = i;
            }
            else if (array[i] < array[min]) {
                min = i;
            }
        }
        System.out.println("max = " + array[max] + "\nmin = " + array[min]);
        System.out.println(Math.abs(array[max]) > Math.abs(array[min]) ? array[max] : array[min]);
    }
}
