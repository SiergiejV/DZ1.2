package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите меньшее число диапазона: ");
        System.out.println("Введите большее число диапазона: ");
        System.out.println("Введите определяемое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c < a && c < b) {
            System.out.println("Число принадлежит наименьшему диапазону");
        } else {
            if (c > a && c < b) {
                System.out.println("Число принадлежит среднему диапазону");
            } else {
                if (c > a && c > b) {
                    System.out.println("Число принадлежит верхнему диапазону");
                }
            }
        }
    }
}