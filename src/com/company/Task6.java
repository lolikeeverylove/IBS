package com.company;

import java.util.Scanner;

public class Task6 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = scan.nextInt();
        switch (x){
            case 1:
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int y = scan.nextInt();
                System.out.println("Количество выбранных единиц?");
                int j = scan.nextInt();
                switch (y){
                    case 1:
                        System.out.println("> Метры: " + j+
                                "\n> Мили: " + j * 0.00062137+
                                "\n> Ярды: " + j * 1.0936 +
                                "\n> Футы: " + j * 3.2808);
                        break;
                    case 2:
                        System.out.println("> Метры: " + j/0.00062137+
                                "\n> Мили: " + j +
                                "\n> Ярды: " + j * 1760.0 +
                                "\n> Футы: " + j* 5280.0);
                        break;
                    case 3:
                        System.out.println("> Метры: " + j/1.0936+
                                "\n> Мили: " + j  * 0.00056818+
                                "\n> Ярды: " + j  +
                                "\n> Футы: " + j * 3);
                        break;
                    case 4:
                        System.out.println("> Метры: " + j /3.2808+
                                "\n> Мили: " + j * 0.00018939+
                                "\n> Ярды: " + j * 0.33333 +
                                "\n> Футы: " + j );
                        break;
                }
        }
    }
}
