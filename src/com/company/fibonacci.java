package com.company;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        int num = 0, fib = 1, fibprev = 0;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("fibonacci series : ");
        for(int i = 1; i<=num; i++){
            System.out.print(fibprev +", ");
            int sum = fib + fibprev;
            fibprev = fib;
            fib = sum;
        }
    }
}
