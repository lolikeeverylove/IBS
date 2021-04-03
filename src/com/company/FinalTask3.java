package com.company;

import java.util.Scanner;

public class FinalTask3 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите количество строк");
        int x = scan.nextInt();
        System.out.println("Press strings");
        String str = "";
        long past = 0;
        String lastStr = "";
        for (int i = 0; i < x; i++) {
            str = scan.next();
            if(str.chars().distinct().count() > past){
                lastStr = str;
                past = str.chars().distinct().count();
            }
        }
        System.out.println(lastStr);
    }
}
