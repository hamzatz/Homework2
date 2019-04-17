package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Как тебя зовут?");
            String name = scanner.nextLine();
            System.out.println("Сколько тебе лет?");
            int age = scanner.nextInt();
            System.out.println("Сколько градусов на улице?");
            int grads = scanner.nextInt();

            if (grads >= 30 || grads < -20 && age > 20 && age < 45) {
                System.out.println(name + " тебе нельзя на улицу!");

            } else if ( grads <= 0 || grads > 28 &&age < 20 ) {
                System.out.println(name + " тебе нельзя на улицу!");

            } else if ( grads < -10|| grads > 25 && age > 45 ) {
                System.out.println(name + " тебе нельзя на улицу!");
            } else {
                System.out.println("Ты идешь к своему другу!");
            }
        }
    }
}