package com.company;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 3;
        int b = 3;
        System.out.println("Введите поэлементно матрицу");
        int i, j;
        int[][] mas = new int[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                mas[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for (int k = 0; k < b; k++) {
            System.out.println(k + " элемент = " + mas[0][k]*3);
        }

    }
}

