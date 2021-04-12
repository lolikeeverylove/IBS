package com.company;

import java.util.Scanner;

public class FinalTask1 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Текущий курс доллара: ");
        double y = scan.nextDouble();
        System.out.print("Кол-во рублей:  ");
        double x = scan.nextDouble();
        scan.close();
        System.out.printf("%.2f%n",x/y);

    }
}
