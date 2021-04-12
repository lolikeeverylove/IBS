package com.company;

import java.util.Scanner;

public class Task13 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        str = scan.nextLine();
        int i = 0;
        String[] subStr;
        String delitel = " ";
        subStr = str.split(delitel);
        boolean valid;
        for (String s : subStr) {
            valid = s.matches("(^[a-zA-Z]+)|(\\s[a-zA-Z]+\\s)|([a-zA-Z]+$)");
            if (valid){
                i++;
                System.out.println(s);
            }
        }
        System.out.println("кол- во слов " + i);
    }
}