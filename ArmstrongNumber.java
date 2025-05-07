package com.loopjava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int original = a, sum = 0;
        while (a != 0) {
            int digit = a % 10;
            sum += digit * digit * digit;
            a /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

// int a = sc.nextInt();
// int original = a , sum = 0;
//while (a !=0){
//int digit = a%10;
//sum += digit *digit * digit;
//a/= 10;
//
//}
//if (sum = original){
//System.out.println("it is Armstrong number" + original);
//}else {
//	System.out.println("is not an Armstrong number" + original);
//}