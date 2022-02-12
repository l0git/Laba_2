package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число X: ");
        int x = scanner.nextInt();
        System.out.println("Введите количество повторов: ");
        int y = scanner.nextInt();
        int m = (y*2)+1;
        double n = 0;
        int result = 1;

        for (int i = 2; i < m; i+=2) {
            for (int j = 1; j <= (i+=1); j++) {
                result = result * j;
                i-=1;
            }
            System.out.println("Факториал: "+result);
            i-=1;
            int k = 0;
            for (k=0;k<=1;k++) {
                n = n + (Math.pow(x, i)) / result;
                System.out.println("Число: "+n);
            }
            for(int p =0; p<=m;p++){
                n = n - ((Math.pow(x, i)) / result);
            }
            result = 1;
            System.out.println("Число: "+n);
        }
        System.out.println("Число будет равно: " + (1 + n));
    }
}