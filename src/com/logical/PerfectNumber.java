package com.logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc =new Scanner(System.in);
        long num,sum=0;
        num = sc.nextLong();
        for (int i=1;i<num/2;i++){
            if (num%i == 0){
                sum = sum+i;
            }
        }
        if (sum == num){
            System.out.println(num +" is a Perfect number");
        }else {
            System.out.println(num+" is not a perfect number");
        }
    }
}
