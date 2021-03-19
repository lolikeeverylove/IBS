package com.company;

import java.util.Scanner;

public class Task7 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int lenght = scan.nextInt();
        int x =5;
        int y = 10;
        int b = 6;
        int [] array = new int [lenght];
        for (int i = 0; i < array.length ; i++) {
            array[i] = scan.nextInt();
            if (array[i] == x || array[i] == y || array[i] == b) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
