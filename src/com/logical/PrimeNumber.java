package com.logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2 != 0){
            System.out.println(n+" is a Prime number");
        }else {
            System.out.println(n+" is not a Prime number");
        }
    }
}
