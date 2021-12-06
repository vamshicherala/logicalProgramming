package com.logical;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.print("Enter the number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num,reverse=0;
        for (;i!=0;i=i/10){
            int remainder = i%10;
            reverse = reverse*10+remainder;
        }
        System.out.println(reverse);
    }
}
