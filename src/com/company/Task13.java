package com.company;

import java.text.Normalizer;
import java.util.Scanner;

public class Task13 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "I love java 8 Я люблю java 14 core1";
        int i = 0;
        String[] subStr;
        String delitel = " ";
        subStr = str.split(delitel);
        boolean valid;
        for (String s : subStr) {
            valid = s.matches("\\p{L}+");
            if (valid){
                i++;
                System.out.println(s);
            }
        }
        System.out.println("кол- во слов " + i);
        }
    }

