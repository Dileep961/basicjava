package com.loopjava;

import java.util.Scanner;

public class Oddoreven {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your Number:");
	int a = sc.nextInt();
	if (a % 2 == 0) {
        System.out.println("Even Number");
    } else {
        System.out.println("Odd Number");
    }
	
	}
}
