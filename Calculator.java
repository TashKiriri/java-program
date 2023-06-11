/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Select an operation (+, -, *, /): ");
        String operator = scanner.next();
        
        double result = 0;
        
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}

    

