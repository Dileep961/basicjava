package com.loopjava;

public class Fibonacci {
public static void main(String[] args) {
//	int n = 10;
//	int a = 0;
//	int b = 1;
//	System.out.println("Fibonacci series up to " + n + " terms:");
//	for (int i = 0; i < n; i++) {
//	    System.out.print(a + " ");
//	    int c = a + b;
//        a = b;
//        b = c; 
//}
//}}


// using for loop in fibonacci series

int n = 10; // Number of terms
int a = 0, b = 1;
System.out.print("Fibonacci Series: " + a + " " + b);

for (int i = 2; i < n; i++) {
    int next = a + b;
    System.out.print(" " + next);
    a = b;
    b = next;
}
}
}