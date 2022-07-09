package com.company;

import java.util.Scanner;

public class exponentialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer base number : ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent : ");
        int exp = sc.nextInt();
        for(int i=0; i<exp; i++){
            System.out.println(base +" to the power of "+i+" = "+pow(base,i));
        }
    }
    public static  int pow(int num, int power){
        return (int) Math.pow(num, power);
    }
}
