package com.company;

import java.util.Scanner;

public class Task8 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");

        int n = scan.nextInt();
        int x = 0;
        for (int i=1; i <= n; i++){
            if (i%2 == 1)
                x = x + i;
        }
        System.out.println (x);
    }
}
