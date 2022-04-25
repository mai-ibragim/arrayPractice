package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        int a[] = new int[10];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(0, 20);
            System.out.println(a[i]);
            sum=sum+a[i];
            count++;
        }
        System.out.println(sum);
        System.out.println(sum + " / " + count + " = " + (sum/count));
    }
}

