package com.loopjava;

import java.util.Scanner;

public class Digits {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
    int num = sc.nextInt();
    int sum = 0;

    while (num != 0) {
        sum += num % 10;
        num /= 10;
    }

    System.out.println("Sum of digits: " + sum);
}
}
// int a,
// int sum,
// while (a!= 0) {
//	 sum += num%10;
//	 num/=10;
// }
//System.out.println("sum of digits: " + sum);