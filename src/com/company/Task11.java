package com.company;

import java.util.Scanner;

public class Task11 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите любое число: ");
        String n = scan.next();
        System.out.print("Введите любое число: ");
        int x = scan.nextInt();
        scan.close();
        System.out.println(x < Integer.parseInt(n)? (double) x : Double.parseDouble(n) );
    }
}
