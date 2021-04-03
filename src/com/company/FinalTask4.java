package com.company;

import java.util.Scanner;

public class FinalTask4 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Отгадавй загадку Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer =  "Заархивированный вирус";
        String toAnswer;

        for (int i = 0; i < 3; i++) {
            toAnswer = scan.nextLine();
            if (toAnswer.equals("Подсказка") && i == 0){
                System.out.println("Подсказываем...");
                toAnswer = scan.nextLine();
                if (answer.equals(toAnswer)) {
                    System.out.println("Правильно");
                } else {
                    System.out.println("Обидно приходи в другой раз");
                }
                break;

            }else if(toAnswer.equals("Подсказка")){
                System.out.println("Подсказка уже недоступна");
                toAnswer = scan.nextLine();
                if (answer.equals(toAnswer)) {
                    System.out.println("Правильно");
                    break;
                } else if (i == 2) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                } else {
                    System.out.println("Подумай еще");
                }
            }
            else {
                if (answer.equals(toAnswer)) {
                    System.out.println("Правильно");
                    break;
                } else if (i == 2) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                } else {
                    System.out.println("Подумай еще");
                }
            }
        }
    }
}
