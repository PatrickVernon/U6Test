package com.mycompany.u6test;


import java.util.InputMismatchException;
import java.util.Scanner;

public class U6Test {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        try{
            System.out.println("Enter a number: ");
            a = s.nextInt();
            System.out.println("Enter another number: ");
            b = s.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Incorrect input type...");
        }
        
        try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        
        
        System.out.println("Result: " + c);
        
    }
}
