package com.company;

import java.util.Scanner;

public class Task12 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String n = scan.next();
        scan.close();
        if (n.contains("Java")) {
            if (n.startsWith("I like")){
                if(n.endsWith("!!!")){
                    System.out.println(n.toUpperCase());
                    System.out.println(n.replace("a", "o").substring(7,11));
                }
            }
        }
    }
}
