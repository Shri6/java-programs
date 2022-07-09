package com.company;

import java.util.Scanner;

public class sumAndMinOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = add(num1,num2);
        int b = min(num1, num2);
        System.out.println("sum : "+a);
        System.out.println("minimum : "+b);
    }
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int min(int num1, int num2){
        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}

