package com.loopjava;
import java.util.Scanner;

public class Marks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter your marks: ");
    int marks = sc.nextInt();

    if (marks >= 40) {
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }
}
}
