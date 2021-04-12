package com.company;

import java.util.Scanner;

public class FinalTask2 {

    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        System.out.println("VVEDI PRIMER");
        String str = lol.nextLine();

        char[] aboltus = str.toCharArray();
        boolean xDetected = false;
        int result;
        int xIndex = 0;
        int xCount = 0;

        for (int i = 0; i < aboltus.length - 2; i++) {
            if (aboltus[i] == 'x') {
                xDetected = true;
                xIndex = i;
                xCount++;
            }
            if (xCount > 1) {
                System.out.println("В уравнении больше одного неизвестного");
                throw new Error();
            }
        }

        if (xDetected) {
            if (xIndex == 2 && aboltus[1] == '-') {
                aboltus[1] = '+';

            } else if (xIndex == 2 && aboltus[1] == '+') {
                xIndex = 0;
                aboltus[2] = aboltus[0];
            }
            aboltus[xIndex] = aboltus[4];
            if (aboltus[1] == '-') {
                aboltus[1] = '+';
            } else {
                aboltus[1] = '-';
            }
        }

        int x = aboltus[0] - '0';
        int y = aboltus[2] - '0';

        switch (aboltus[1]) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            default: result = 0;
        }
        System.out.println("result = " + result);
    }
}
