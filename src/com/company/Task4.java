package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double l;
        if( Math.floor((x+y+z)/3/2)>3){
            System.out.println("Программа выполнена корректно");
        }



    }
}
