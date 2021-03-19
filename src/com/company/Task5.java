package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        String z = scan.next();
        switch (z){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            case "*":
                System.out.println(x*y);
                break;
        }
    }
}
