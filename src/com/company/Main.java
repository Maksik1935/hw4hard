package com.company;

public class Main {

    public static void main(String[] args) {
        task5();
    }
    static void task4() {
        for(int i = 1; i <= 30; i++) {
            if(i%3 == 0 && i%5 !=0) {
                System.out.println(i + ": ping");
            } else if (i%3 != 0 && i%5 == 0) {
                System.out.println(i + ": pong");
            } else if (i%3==0 && i%5==0) {
                System.out.println(i + ": ping pong");
            } else {
                System.out.println(i + ": ");
            }
        }
    }
    static void task5() {
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for(int i = 0; i < 8; i+=2) {
            num1 = num1 + num2;
            num2 = num1 + num2;
            System.out.print(num1 + " ");
            System.out.print(num2 + " ");
    }


    }
}
