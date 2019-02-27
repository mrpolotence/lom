package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean repeat = true;
        ArrayList<Flower> list = new ArrayList<>();

        while (repeat) {
            System.out.println("1Ввести данные цветка");
            System.out.println("2Список цветов");
            System.out.println("3Сбор букета");
            System.out.println("4Выход");
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Введите название");
                    String name = scanner1.nextLine();
                    System.out.println("Введите цвет");
                    String color = scanner1.nextLine();
                    System.out.println("Введите цену");
                    double price = Double.parseDouble(scanner1.nextLine());

                    list.add(new Flower(price, color, name));
                    break;
                case 2:
                    for (Flower flower : list) {
                        System.out.println(flower.getInfo());
                    }
                    break;
                case 3:
                    double sum = 0;
                    for (Flower bouquet : list) {
                        sum += bouquet.getPrice();
                    }
                    System.out.println("Стоимость букета из предложенных цветов\n");
                    System.out.println(sum);
                    break;
                case 4:
                    repeat = false;
                    System.out.println("выход");
                    break;
                default:
                    System.out.println("ошибка");
            }
        }
    }
}
