package com.xpanxion.assignments.student.JavaOneII;
import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    private ArrayList<String> history;

    public Calculator() {
        history = new ArrayList<>();
    }

    public void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String num1 = input.nextLine();
        if (num1.equalsIgnoreCase("done")) {
            printHistory();
            return;
        }
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = input.nextLine();
        int result = 0;
        String expression = "";
        switch (operation) {
            case "add":
                result = add(Integer.parseInt(num1), num2);
                expression = num1 + " + " + num2 + " = " + result;
                break;
            case "sub":
                result = sub(Integer.parseInt(num1), num2);
                expression = num1 + " - " + num2 + " = " + result;
                break;
            case "mul":
                result = mul(Integer.parseInt(num1), num2);
                expression = num1 + " * " + num2 + " = " + result;
                break;
            case "div":
                result = div(Integer.parseInt(num1), num2);
                expression = num1 + " / " + num2 + " = " + result;
                break;
            default:
                System.out.println("Input Invalid");
                return;
        }

        System.out.println("Result: " + result);
        history.add(expression);
        calculate();
    }

    public void printHistory() {
        System.out.println("The history of calculations is:");
        for (String s : history) {
            System.out.println(s);
        }
    }

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int sub(int num1, int num2) {
        return num1 - num2;
    }

    private int mul(int num1, int num2) {
        return num1 * num2;
    }

    private int div(int num1, int num2) {
        return num1 / num2;
    }
}