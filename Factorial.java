package com.loopjava;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int f = 1;
    for (int i = 1; i <= num; i++) {
        f *= i;
    }

    System.out.println("Factorial of " + num + " is: " + f);
}
}
