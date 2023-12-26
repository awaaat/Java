package com.main.java;
import java.util.Scanner;
public class Conditional_statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("enter the x value");
        x = scan.nextInt();
        System.out.println("Enter the y value");
        y = scan.nextInt();
        if (x>y) {
            System.out.println("x is greater than y");
        } 
        if (x==y) {
            System.out.println("x is equal to y");
        } else
        System.out.println("x is less than y ");

    }
    
}
