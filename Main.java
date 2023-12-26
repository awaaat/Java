package com.main.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("enter your first number here");
        x = scan.nextInt();
        System.out.println("enter your second number here");
        y = scan.nextInt();
        System.out.println("Enter your Operator Here");
        String operation  = scan.next();
        if (operation.equals("+")){
            System.out.println( "The Results for your addition  are " + (x+y));
        }
        else if (operation.equals("-")) {
            System.out.println("The Subtraction result is " + (x-y));

        }
        else if (operation.equals("*")) {
          System.out.println("This is the Multiplication result " + (x*y));  
        }
        else if (operation.equals("/")) {
            System.out.println("The quotient is " +  (x/y));
        }
        else
        System.out.println("enter the correct value or operation");
            
    }
}
